package com.example.test.demo.elk;

import com.google.gson.annotations.SerializedName;

public class log4j {

    /**
     * hostName : cs172-16-1-232
     * messageBase.header : {"Cache-Control":"no-store","Connection":"close","X-Application-Context":"app-gateway:1","Content-Language":"zh-CN","Date":"Mon, 21 Jan 2019 09:00:45 GMT","Content-Type":"application/json;charset=UTF-8"}
     * messageBase.uri : /p2p/activity_getvisittoken
     * serLoc : DGDC
     * messageBase.type : SPRING_RESP
     * messageBase.httpMethod : POST
     * ip : 172.16.1.232
     * messageBase.requestBody : {"Param":"PGEqCbHct+JEwYN0GeP7\/bsIw2f8a9NHUs7z5mkqHChPdjB2tcZL9oqadpU7i6rlykTx3G8SKlBTgdATBS8JM53p3dN2n494auBsAh9IAIQ8ZhJouRE1+tze1nLOsu3N2S5rOOv8Ae\/Je12CU5RIVgx70Gd8BirmvqLVwcRWZspjGY4\/s6dMZ7rJlrjrx1Hcgdx3QGjjVeB5J6E3npSBMjGYlj9oERgdUNPhzeHeft9+uBdrKtJAhqxNg2luKMVBppJjDF8WqwFbdtOoSn4XRhthjSYDHdRnfvuS2c+Ghl0YbO+ftmSx9tUyi18mTRL6lA9axGaTkqZsBrK9NBHB21RLDjJZ8M4o59Yg93EwFvhiQTU9bbSchp4l0WoEQYkcHH9xc1ZRaxYakrhIOtoxOgsonmgJKSQ5E4adN0UWGnJ3NIEjr2D9\/GlnpZDOoH4U6mwQyFVPKrHnvgsXTfVwdxvsfL9fJiytsN3QhohWAAYTRwjecVAqaA==","UUId":"62574F8E-3BD5-4FF0-ABE5-19FDBF0F02FD","Version":"5.2.0"}
     * serviceName : app-gateway
     * addDate : 2019-01-21T09:00:45.128
     * messageBase.time : 1
     * trace : d0505163b0547c40
     * messageBase.status : 500
     * logLevel : INFO
     * topic : app-log
     * applicationId : app-gateway
     * parentSpan :
     * span : d0505163b0547c40
     */

    private String hostName;
    @SerializedName("messageBase.header")
    private String _$MessageBaseHeader196; // FIXME check this code
    @SerializedName("messageBase.uri")
    private String _$MessageBaseUri127; // FIXME check this code
    private String serLoc;
    @SerializedName("messageBase.type")
    private String _$MessageBaseType263; // FIXME check this code
    @SerializedName("messageBase.httpMethod")
    private String _$MessageBaseHttpMethod148; // FIXME check this code
    private String ip;
    @SerializedName("messageBase.requestBody")
    private String _$MessageBaseRequestBody295; // FIXME check this code
    private String serviceName;
    private String addDate;
    @SerializedName("messageBase.time")
    private long _$MessageBaseTime117; // FIXME check this code
    private String trace;
    @SerializedName("messageBase.status")
    private int _$MessageBaseStatus5; // FIXME check this code
    private String logLevel;
    private String topic;
    private String applicationId;
    private String parentSpan;
    private String span;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String get_$MessageBaseHeader196() {
        return _$MessageBaseHeader196;
    }

    public void set_$MessageBaseHeader196(String _$MessageBaseHeader196) {
        this._$MessageBaseHeader196 = _$MessageBaseHeader196;
    }

    public String get_$MessageBaseUri127() {
        return _$MessageBaseUri127;
    }

    public void set_$MessageBaseUri127(String _$MessageBaseUri127) {
        this._$MessageBaseUri127 = _$MessageBaseUri127;
    }

    public String getSerLoc() {
        return serLoc;
    }

    public void setSerLoc(String serLoc) {
        this.serLoc = serLoc;
    }

    public String get_$MessageBaseType263() {
        return _$MessageBaseType263;
    }

    public void set_$MessageBaseType263(String _$MessageBaseType263) {
        this._$MessageBaseType263 = _$MessageBaseType263;
    }

    public String get_$MessageBaseHttpMethod148() {
        return _$MessageBaseHttpMethod148;
    }

    public void set_$MessageBaseHttpMethod148(String _$MessageBaseHttpMethod148) {
        this._$MessageBaseHttpMethod148 = _$MessageBaseHttpMethod148;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String get_$MessageBaseRequestBody295() {
        return _$MessageBaseRequestBody295;
    }

    public void set_$MessageBaseRequestBody295(String _$MessageBaseRequestBody295) {
        this._$MessageBaseRequestBody295 = _$MessageBaseRequestBody295;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public long get_$MessageBaseTime117() {
        return _$MessageBaseTime117;
    }

    public void set_$MessageBaseTime117(long _$MessageBaseTime117) {
        this._$MessageBaseTime117 = _$MessageBaseTime117;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public int get_$MessageBaseStatus5() {
        return _$MessageBaseStatus5;
    }

    public void set_$MessageBaseStatus5(int _$MessageBaseStatus5) {
        this._$MessageBaseStatus5 = _$MessageBaseStatus5;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getParentSpan() {
        return parentSpan;
    }

    public void setParentSpan(String parentSpan) {
        this.parentSpan = parentSpan;
    }

    public String getSpan() {
        return span;
    }

    public void setSpan(String span) {
        this.span = span;
    }
}
