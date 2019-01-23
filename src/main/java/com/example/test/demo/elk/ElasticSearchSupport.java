package com.example.test.demo.elk;

import com.example.test.demo.mysql.model.*;
import com.google.gson.Gson;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.cluster.node.DiscoveryNode;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.*;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ElasticSearchSupport {
    private static ElasticSearchSupport support;
    /*** elk连接client ***/
    private TransportClient client;

    private ElasticSearchSupport() throws Exception {
        Settings settings = Settings.builder().put("cluster.name", "apm-mobile")//集群名称
                .build();
        client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.100.14.152"), 9300));
    }

    /*** 获取数据链路层实例 ***/
    public static ElasticSearchSupport getInstance() throws Exception {
        if (support == null) {
            synchronized (ElasticSearchSupport.class) {
                if (support == null) {
                    support = new ElasticSearchSupport();
                }
            }
        }
        return support;
    }

    public void insert() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("addDate", System.currentTimeMillis());
        map.put("hostName", "cs172-16-1-232");
        map.put("messageBase.header", "{\"Cache-Control\":\"no-store\",\"Connection\":\"close\",\"X-Application-Context\":\"app-gateway:1\",\"Content-Language\":\"zh-CN\",\"Date\":\"Mon, 21 Jan 2019 09:00:40 GMT\",\"Content-Type\":\"application/json;charset=UTF-8\"}");
        map.put("messageBase.uri", "/user/user_personalinfo/" + new Random().nextLong());
        client.prepareIndex("javaapi",
                "accessjava").setSource(map).execute().actionGet();
    }

    /*** 获取SearchRequestBuilder ***/
//    private SearchRequestBuilder getDefalutSearchRequestBuilder() {
//        return client.prepareSearch(ElasticSearchConfig._INDEX)
//                .setTypes(ElasticSearchConfig._TYPE)
//                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH);
//    }
    public void test() throws Exception {
        // 连接到的节点
       /* List<DiscoveryNode> connectedNodes = client.connectedNodes();
        for (DiscoveryNode discoveryNode : connectedNodes) {
            System.out.println(discoveryNode.getHostAddress());
        }
        *//**进行Mapping设置，这一步设置了索引字段的存储格式，极其重要，否则后面的查询会查出0条记录*//*
        XContentBuilder mapping = XContentFactory.jsonBuilder()
                .startObject()
                .startObject("properties")
                .startObject("PolicyCode")
                .field("type", "string")
                .field("index","not_analyzed")
                .endObject()
                .startObject("ServiceId")
                .field("type", "string")
                .field("index", "not_analyzed")
                .endObject()
                .startObject("CreateTime")
                .field("type", "date")
                .field("format","yyyy-MM-dd HH:mm:ss")
                .endObject()
                .endObject()
                .endObject();

        CreateIndexRequestBuilder prepareCreate =client.admin().indices().prepareCreate("javaapi");
        prepareCreate.setSettings(settings).addMapping("accessjava", mapping).execute().actionGet();

        *//**向索引库中插入数据*//*
        for (int i = 0; i < 10; i++) {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            if (i % 2 == 0) {
                hashMap.put("PolicyCode", "5674504720");
                hashMap.put("ServiceId", "SE2");
                hashMap.put("CreateTime", "2016-08-21 00:00:01");
            } else {
                hashMap.put("PolicyCode", "666666666");
                hashMap.put("ServiceId", "SE3");
                hashMap.put("CreateTime", "2016-10-21 00:00:01");
            }
            IndexResponse indexResponse = client.prepareIndex("javaapi",
                    "accessjava").setSource(hashMap).get();
        }*/
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\谢文良\\Desktop\\新建文件夹 (3)\\server (2).log")),
                    "UTF-8"));
            String lineTxt = null;
            Gson gson = new Gson();
            while ((lineTxt = br.readLine()) != null) {
                try {
                    LocalRequestLogBean localRequestLogBean = gson.fromJson(lineTxt, LocalRequestLogBean.class);
                    if (localRequestLogBean != null) {
                        Map<String, Object> objectHashMap = casttoMap(localRequestLogBean);
                        objectHashMap.put("inputDate", currentDateString());
                        IndexResponse indexResponse = client.prepareIndex("javaapi",
                                "accessjava").setSource(objectHashMap).execute().actionGet();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("read errors :" + e);
        }
    }

    public static String currentDateString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS+0800", Locale.CHINESE);
        return format.format(System.currentTimeMillis());
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
