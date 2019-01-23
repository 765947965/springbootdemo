package com.example.test.demo.elk;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

@Service
public class ElasticSearchSupport {
    /*** elk连接client ***/
    private TransportClient client;
    private String index;

    private ElasticSearchSupport() {
        try {
            Settings settings = Settings.builder().put("cluster.name", "apm-mobile")//集群名称
                    .build();
            client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.100.14.152"), 9300));
            run();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private void creatIndex() {
        String todayIndex = "log4j-" + DateFormatUtil.getIndex(System.currentTimeMillis()) + "1";
        if (!todayIndex.equals(index)) {
            index = todayIndex;
            try {
                XContentBuilder builder = XContentFactory.jsonBuilder()
                        .startObject()
                        .startObject("properties")
                        .startObject("addDate")
                        .field("type", "date")
                        .field("format", "yyyy-MM-dd HH:mm:ss.SSS||yyy-MM-dd||epoch_millis")
                        .endObject()
                        .startObject("serviceName")
                        .field("type", "keyword")
                        .endObject()
                        .startObject("messageBase.type")
                        .field("type", "keyword")
                        .endObject()
                        .endObject()
                        .endObject();
                client.admin()
                        .indices().prepareCreate(index).addMapping("log4j", builder).execute().actionGet();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    creatIndex();
                    insert();
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void insert() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("hostName", "cs172-16-1-232");
        map.put("messageBase.header", "{\"Cache-Control\":\"no-store\",\"Connection\":\"close\",\"X-Application-Context\":\"app-gateway:1\",\"Content-Language\":\"zh-CN\",\"Date\":\"Mon, 21 Jan 2019 09:00:40 GMT\",\"Content-Type\":\"application/json;charset=UTF-8\"}");
        map.put("messageBase.uri", "/user/user_personalinfo/" + new Random().nextInt(20));
        map.put("serLoc", "DGDC");
        map.put("messageBase.type", "SPRING_RESP");
        map.put("messageBase.httpMethod", "POST");
        map.put("ip", "172.16.0." + new Random().nextInt(200));
        map.put("messageBase.requestBody", "00680050IyZGNh06amVbJAoBHAQWChVzEEQLcg8yCDYvWnUXIjRJb2czFgYGMi4gWCc5dlB9KwkSOz0");
        map.put("serviceName", "app-gateway");
        map.put("addDate", System.currentTimeMillis());
        map.put("messageBase.time", new Random().nextInt(500));
        map.put("trace", "2eddf8abfba14cdb");
        int nextType = new Random().nextInt(500);
        map.put("messageBase.status", (30 < nextType && nextType < 460) ? 200 : 401);
        map.put("logLevel", "INFO");
        map.put("topic", "app-log");
        map.put("applicationId", "app-gateway");
        map.put("parentSpan", "");
        map.put("span", "2eddf8abfba14cdb");
        client.prepareIndex(index, "log4j").setSource(map).execute().actionGet();
    }


    private Map<String, Object> casttoMap(Object object) {
        Class cs = object.getClass();
        Field[] fls = cs.getDeclaredFields();
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Field fl : fls) {
            fl.setAccessible(true);
            Object o = null;
            try {
                o = fl.get(object);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (o != null) {
                if (fl.getType().equals(byte.class)
                        || fl.getType().equals(short.class)
                        || fl.getType().equals(int.class)
                        || fl.getType().equals(long.class)
                        || fl.getType().equals(float.class)
                        || fl.getType().equals(double.class)
                        || fl.getType().equals(boolean.class)
                        || fl.getType().equals(char.class)
                        || fl.getType().equals(String.class)
                        || fl.getType().equals(Byte.class)
                        || fl.getType().equals(Short.class)
                        || fl.getType().equals(Integer.class)
                        || fl.getType().equals(Long.class)
                        || fl.getType().equals(Float.class)
                        || fl.getType().equals(Double.class)
                        || fl.getType().equals(Boolean.class)) {
                    hashMap.put(fl.getName(), o);
                } else {
                    hashMap.put(fl.getName(), casttoMap(o));
                }
            }
        }
        return hashMap;
    }
}
