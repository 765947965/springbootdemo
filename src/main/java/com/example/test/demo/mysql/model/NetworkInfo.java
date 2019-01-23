package com.example.test.demo.mysql.model;

public class NetworkInfo {

    /**
     * ConnectEndDate : 1541041863470
     * ConnectStartDate : 1541041863373
     * DomainLookupEndDate : 1541041863372
     * DomainLookupStartDate : 1541041863354
     * DomainLookupTime : 18
     * FetchEndDate : 1541041863482
     * FetchStartDate : 1541041863348
     * FetchStartDateFormat : 2018-11-01 11:11:03.348
     * FetchTime : 134
     * HttpUserAgent : okhttp/3.9.0
     * Method : GET
     * NetworkProtocolName : HTTP_1_1
     * NetworkStatusCode : 0
     * ProxyConnection : false
     * RequestCompression : false
     * RequestDomains : www.baidu.com
     * RequestEndDate : 0
     * RequestHeaderSize : 94
     * RequestMills : 1541041863470
     * RequestStartDate : 1541041863470
     * RequestTime : 0
     * RequestUrl : https://www.baidu.com/
     * ResourceFetchType : 2
     * RespondEndDate : 1541041863482
     * RespondStartDate : 1541041863470
     * RespondTime : 12
     * ResponseBodySize : 1177
     * ResponseCompression : true
     * ResponseHeaderSize : 367
     * ReusedConnection : true
     * SecureConnectEndDate : 1541041863460
     * SecureConnectStartDate : 1541041863388
     * SecureConnectTime : 72
     * SessionId : APM9f84e987-6adc-4adc-aa64-e20e14f1efe5SDKLOG
     * TCPExpendTime : 97
     * TcpObjectId : 131099375
     */

    /*** 请求唯一标识 ***/
    private String requestId;
    /*** 任务完成后立即建立到服务器的连接的时间。 ***/
    private long connectEndDate;
    /*** 开始建立到服务器的TCP连接之前的时间。 ***/
    private long connectStartDate;
    /*** 域名DNS解析结束时间 ***/
    private long domainLookupEndDate;
    /*** 域名DNS解析开始时间 ***/
    private long domainLookupStartDate;
    /*** 域名DNS解析时间（DomainLookupEndDate - DomainLookupStartDate）毫秒 ***/
    private long domainLookupTime;
    /*** 任务结束（包括失败）的时间 ***/
    private long fetchEndDate;
    /*** 任务开始从服务器或本地获取资源的时间。 ***/
    private long fetchStartDate;
    /*** 任务开始从服务器或本地获取资源的时间。格式化后的，供后台查询用 ***/
    private String fetchStartDateFormat;
    /*** 从请求开始到请求结束的整体时间. ***/
    private long fetchTime;
    /*** 请求框架标识 ***/
    private String httpUserAgent;
    /*** post/get ***/
    private String method;
    /*** Http协议版本 ***/
    private String networkProtocolName;
    /*** Android :错误类型 失败: Http连接失败:1 Http响应错误: 2 其他错误:3) 成功: 0 iOS : HttpCode ***/
    private int networkStatusCode;
    /*** 表示是否通过代理来访问Http请求 ***/
    private boolean proxyConnection;
    /*** 请求是否使用gzip压缩 ***/
    private boolean requestCompression;
    /*** 请求域名 ***/
    private String requestDomains;
    /*** 任务完成后立即请求资源的时间，无论它是从服务器检索还是从本地资源检索。 ***/
    private long requestEndDate;
    /*** 请求头大小 ***/
    private String requestHeaderSize;
    /*** 请求唯一标识 ***/
    private long requestMills;
    /*** 任务开始请求资源之前的时间，无论它是从服务器检索还是从本地资源检索。 ***/
    private long requestStartDate;
    /*** 请求头和请求体的发送时间 ***/
    private long requestTime;
    /*** 请求地址 ***/
    private String requestUrl;
    /*** 请求API(团贷网特有) ***/
    private String requestAPI;
    /*** 获取资源的类型:1.未知2.通过网络3.服务器推送4.缓存(Android待定） ***/
    private int resourceFetchType;
    /*** 任务接收到资源的最后一个字节之后的时间。 ***/
    private long respondEndDate;
    /*** 任务收到来自服务器或本地资源的响应的第一个字节后的时间。 ***/
    private long respondStartDate;
    /*** 服务响应用时（RespondEndDate - RespondStartDate）毫秒 ***/
    private long respondTime;
    /*** 回应体大小 ***/
    private String responseBodySize;
    /*** 请求体大小 ***/
    private String requestBodySize;
    /*** 回应是否使用gzip压缩 ***/
    private boolean responseCompression;
    /*** 回应头大小 ***/
    private String responseHeaderSize;
    /*** 是否使用持久连接来获取资源 ***/
    private boolean reusedConnection;
    /*** 安全握手完成后的时间。 ***/
    private long secureConnectEndDate;
    /*** 如果不使用加密连接、使用持久连接或从本地资源检索资源，则此值为nil。 ***/
    private long secureConnectStartDate;
    /*** SSL用时（SecureConnectEndDate - SecureConnectStartDate）毫秒 ***/
    private long secureConnectTime;
    /*** 会话Id,目的: 用来关联一次会话的过程中, 单个用户的请求量 ***/
    private String sessionId;
    /*** TCP用时(SecureConnectStartDate - ConnectStartDate) 毫秒 ***/
    private long tCPExpendTime;
    /*** TCP复用对象Id ***/
    private String tcpObjectId;
    /*** DNS运营商 IP ***/
    private String localDNSIP;
    /*** 主机IP ***/
    private String hostIP;
    /*** Http 网络状态描述 ***/
    private String statusDes;
    /*** 网络请求除去 dns、tcp、ssl、response的其它耗时操作 ***/
    private long transmissionTime;
    /*** 请求头 ***/
    private String requestHeader;
    /*** 响应头 ***/
    private String respondHeader;
    /*** cookies ***/
    private String cookies;


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public long getConnectEndDate() {
        return connectEndDate;
    }

    public void setConnectEndDate(long connectEndDate) {
        this.connectEndDate = connectEndDate;
    }

    public long getConnectStartDate() {
        return connectStartDate;
    }

    public void setConnectStartDate(long connectStartDate) {
        this.connectStartDate = connectStartDate;
    }

    public long getDomainLookupEndDate() {
        return domainLookupEndDate;
    }

    public void setDomainLookupEndDate(long domainLookupEndDate) {
        this.domainLookupEndDate = domainLookupEndDate;
    }

    public long getDomainLookupStartDate() {
        return domainLookupStartDate;
    }

    public void setDomainLookupStartDate(long domainLookupStartDate) {
        this.domainLookupStartDate = domainLookupStartDate;
    }

    public long getDomainLookupTime() {
        return domainLookupTime;
    }

    public void setDomainLookupTime(long domainLookupTime) {
        this.domainLookupTime = domainLookupTime;
    }

    public long getFetchEndDate() {
        return fetchEndDate;
    }

    public void setFetchEndDate(long fetchEndDate) {
        this.fetchEndDate = fetchEndDate;
    }

    public long getFetchStartDate() {
        return fetchStartDate;
    }

    public void setFetchStartDate(long fetchStartDate) {
        this.fetchStartDate = fetchStartDate;
    }

    public String getFetchStartDateFormat() {
        return fetchStartDateFormat;
    }

    public void setFetchStartDateFormat(String fetchStartDateFormat) {
        this.fetchStartDateFormat = fetchStartDateFormat;
    }

    public long getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(long fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNetworkProtocolName() {
        return networkProtocolName;
    }

    public void setNetworkProtocolName(String networkProtocolName) {
        this.networkProtocolName = networkProtocolName;
    }

    public int getNetworkStatusCode() {
        return networkStatusCode;
    }

    public void setNetworkStatusCode(int networkStatusCode) {
        this.networkStatusCode = networkStatusCode;
    }

    public boolean isProxyConnection() {
        return proxyConnection;
    }

    public void setProxyConnection(boolean proxyConnection) {
        this.proxyConnection = proxyConnection;
    }

    public boolean isRequestCompression() {
        return requestCompression;
    }

    public void setRequestCompression(boolean requestCompression) {
        this.requestCompression = requestCompression;
    }

    public String getRequestDomains() {
        return requestDomains;
    }

    public void setRequestDomains(String requestDomains) {
        this.requestDomains = requestDomains;
    }

    public long getRequestEndDate() {
        return requestEndDate;
    }

    public void setRequestEndDate(long requestEndDate) {
        this.requestEndDate = requestEndDate;
    }

    public String getRequestHeaderSize() {
        return requestHeaderSize;
    }

    public void setRequestHeaderSize(String requestHeaderSize) {
        this.requestHeaderSize = requestHeaderSize;
    }

    public long getRequestMills() {
        return requestMills;
    }

    public void setRequestMills(long requestMills) {
        this.requestMills = requestMills;
    }

    public long getRequestStartDate() {
        return requestStartDate;
    }

    public void setRequestStartDate(long requestStartDate) {
        this.requestStartDate = requestStartDate;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public String getRequestAPI() {
        return requestAPI;
    }

    public void setRequestAPI(String requestAPI) {
        this.requestAPI = requestAPI;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public int getResourceFetchType() {
        return resourceFetchType;
    }

    public void setResourceFetchType(int resourceFetchType) {
        this.resourceFetchType = resourceFetchType;
    }

    public long getRespondEndDate() {
        return respondEndDate;
    }

    public void setRespondEndDate(long respondEndDate) {
        this.respondEndDate = respondEndDate;
    }

    public long getRespondStartDate() {
        return respondStartDate;
    }

    public void setRespondStartDate(long respondStartDate) {
        this.respondStartDate = respondStartDate;
    }

    public long getRespondTime() {
        return respondTime;
    }

    public void setRespondTime(long respondTime) {
        this.respondTime = respondTime;
    }

    public String getResponseBodySize() {
        return responseBodySize;
    }

    public void setResponseBodySize(String responseBodySize) {
        this.responseBodySize = responseBodySize;
    }

    public String getRequestBodySize() {
        return requestBodySize;
    }

    public void setRequestBodySize(String requestBodySize) {
        this.requestBodySize = requestBodySize;
    }

    public boolean isResponseCompression() {
        return responseCompression;
    }

    public void setResponseCompression(boolean responseCompression) {
        this.responseCompression = responseCompression;
    }

    public String getResponseHeaderSize() {
        return responseHeaderSize;
    }

    public void setResponseHeaderSize(String responseHeaderSize) {
        this.responseHeaderSize = responseHeaderSize;
    }

    public boolean isReusedConnection() {
        return reusedConnection;
    }

    public void setReusedConnection(boolean reusedConnection) {
        this.reusedConnection = reusedConnection;
    }

    public long getSecureConnectEndDate() {
        return secureConnectEndDate;
    }

    public void setSecureConnectEndDate(long secureConnectEndDate) {
        this.secureConnectEndDate = secureConnectEndDate;
    }

    public long getSecureConnectStartDate() {
        return secureConnectStartDate;
    }

    public void setSecureConnectStartDate(long secureConnectStartDate) {
        this.secureConnectStartDate = secureConnectStartDate;
    }

    public long getSecureConnectTime() {
        return secureConnectTime;
    }

    public void setSecureConnectTime(long secureConnectTime) {
        this.secureConnectTime = secureConnectTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public long gettCPExpendTime() {
        return tCPExpendTime;
    }

    public void settCPExpendTime(long tCPExpendTime) {
        this.tCPExpendTime = tCPExpendTime;
    }

    public String getTcpObjectId() {
        return tcpObjectId;
    }

    public void setTcpObjectId(String tcpObjectId) {
        this.tcpObjectId = tcpObjectId;
    }

    public String getLocalDNSIP() {
        return localDNSIP;
    }

    public void setLocalDNSIP(String localDNSIP) {
        this.localDNSIP = localDNSIP;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public String getStatusDes() {
        return statusDes;
    }

    public void setStatusDes(String statusDes) {
        this.statusDes = statusDes;
    }

    public long getTransmissionTime() {
        return transmissionTime;
    }

    public void setTransmissionTime(long transmissionTime) {
        this.transmissionTime = transmissionTime;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(String requestHeader) {
        this.requestHeader = requestHeader;
    }

    public String getRespondHeader() {
        return respondHeader;
    }

    public void setRespondHeader(String respondHeader) {
        this.respondHeader = respondHeader;
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }
}
