package com.example.test.demo.mysql.model;

public class WebPerformanceInfo {

    /**
     * navigationStart : 1544520002550 准备加载页面的起始时间
     * unloadEventStart : 0 如果前一个文档和当前文档同源,返回前一个文档开始unload的时间
     * unloadEventEnd : 0   如果前一个文档和当前文档同源,返回前一个文档开始unload结束的时间
     * redirectStart : 0    如果有重定向,这里是重定向开始的时间.
     * redirectEnd : 0      如果有重定向,这里是重定向结束的时间.
     * fetchStart : 1544520002609    开始检查缓存或开始获取资源的时间
     * domainLookupStart : 1544520002776   开始进行dns查询的时间
     * domainLookupEnd : 1544520002809    dns查询结束的时间
     * connectStart : 1544520002809  开始建立连接请求资源的时间
     * connectEnd : 1544520003138  建立连接成功的时间.
     * secureConnectionStart : 1544520002818  如果是https请求.返回ssl握手的时间
     * requestStart : 1544520003139  开始请求文档时间(包括从服务器,本地缓存请求)
     * responseStart : 1544520003430  接收到第一个字节的时间
     * responseEnd : 1544520003454  接收到最后一个字节的时间.
     * domLoading : 1544520003436  ‘current document readiness’ 设置为 loading的时间 (这个时候还木有开始解析文档)
     * domInteractive : 1544520004910  文档解析结束的时间
     * domContentLoadedEventStart : 1544520004914  DOMContentLoaded事件开始的时间
     * domContentLoadedEventEnd : 1544520004917  DOMContentLoaded事件结束的时间
     * domComplete : 1544520007677  current document readiness被设置 complete的时间
     * loadEventStart : 1544520007681   触发onload事件的时间
     * loadEventEnd : 1544520007683  onload事件结束的时间
     */

    /**
     * DNS查询耗时 = domainLookupEnd - domainLookupStart
     * TCP链接耗时 = connectEnd - connectStart
     * request请求耗时 = responseEnd - responseStart
     * 解析dom树耗时 = domComplete - domInteractive
     * 白屏时间 = domLoading - fetchStart
     * domready时间 = domContentLoadedEventEnd - fetchStart
     * onload时间 = loadEventEnd - fetchStart
     */
    private String requestId = "";
    private String sortTimeFormat = "";
    private long sortTimeLong;
    private long navigationStart;
    private long unloadEventStart;
    private long unloadEventEnd;
    private long redirectStart;
    private long redirectEnd;
    private long fetchStart;
    private long domainLookupStart;
    private long domainLookupEnd;
    private long domainLookupTime;
    private long connectStart;
    private long connectEnd;
    private long secureConnectionStart;
    private long secureConnectionTime;
    private long tcpExtendTime;
    private long requestStart;
    private long requestTime;
    private long responseStart;
    private long responseEnd;
    private long responseTime;
    private long requestAllTime;
    private long domLoading;
    private long hangTime;
    private long domInteractive;
    private long domContentLoadedEventStart;
    private long domContentLoadedEventEnd;
    private long domComplete;
    private long domRanderTime;
    private long loadEventStart;
    private long loadEventEnd;
    private long loadEventTime;
    private long domParsingTime;
    private long allTime;
    private String sessionId = "";
    private String requestUrl = "";
    private String requestAPI = "";
    private String httpUserAgent = "";
    private String requestDomains = "";
    private String title = "";
    private String referrer = "";
    private String requestUrlNoParameter = "";

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getSortTimeFormat() {
        return sortTimeFormat;
    }

    public void setSortTimeFormat(String sortTimeFormat) {
        this.sortTimeFormat = sortTimeFormat;
    }

    public long getSortTimeLong() {
        return sortTimeLong;
    }

    public void setSortTimeLong(long sortTimeLong) {
        this.sortTimeLong = sortTimeLong;
    }

    public long getNavigationStart() {
        return navigationStart;
    }

    public void setNavigationStart(long navigationStart) {
        this.navigationStart = navigationStart;
    }

    public long getUnloadEventStart() {
        return unloadEventStart;
    }

    public void setUnloadEventStart(long unloadEventStart) {
        this.unloadEventStart = unloadEventStart;
    }

    public long getUnloadEventEnd() {
        return unloadEventEnd;
    }

    public void setUnloadEventEnd(long unloadEventEnd) {
        this.unloadEventEnd = unloadEventEnd;
    }

    public long getRedirectStart() {
        return redirectStart;
    }

    public void setRedirectStart(long redirectStart) {
        this.redirectStart = redirectStart;
    }

    public long getRedirectEnd() {
        return redirectEnd;
    }

    public void setRedirectEnd(long redirectEnd) {
        this.redirectEnd = redirectEnd;
    }

    public long getFetchStart() {
        return fetchStart;
    }

    public void setFetchStart(long fetchStart) {
        this.fetchStart = fetchStart;
    }

    public long getDomainLookupStart() {
        return domainLookupStart;
    }

    public void setDomainLookupStart(long domainLookupStart) {
        this.domainLookupStart = domainLookupStart;
    }

    public long getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public void setDomainLookupEnd(long domainLookupEnd) {
        this.domainLookupEnd = domainLookupEnd;
    }

    public long getConnectStart() {
        return connectStart;
    }

    public void setConnectStart(long connectStart) {
        this.connectStart = connectStart;
    }

    public long getConnectEnd() {
        return connectEnd;
    }

    public void setConnectEnd(long connectEnd) {
        this.connectEnd = connectEnd;
    }

    public long getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public void setSecureConnectionStart(long secureConnectionStart) {
        this.secureConnectionStart = secureConnectionStart;
    }

    public long getRequestStart() {
        return requestStart;
    }

    public void setRequestStart(long requestStart) {
        this.requestStart = requestStart;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(long requestTime) {
        this.requestTime = requestTime > 0 ? requestTime : 0;
    }

    public long getResponseStart() {
        return responseStart;
    }

    public void setResponseStart(long responseStart) {
        this.responseStart = responseStart;
    }

    public long getResponseEnd() {
        return responseEnd;
    }

    public void setResponseEnd(long responseEnd) {
        this.responseEnd = responseEnd;
    }

    public long getDomLoading() {
        return domLoading;
    }

    public void setDomLoading(long domLoading) {
        this.domLoading = domLoading;
    }

    public long getDomInteractive() {
        return domInteractive;
    }

    public void setDomInteractive(long domInteractive) {
        this.domInteractive = domInteractive;
    }

    public long getDomContentLoadedEventStart() {
        return domContentLoadedEventStart;
    }

    public void setDomContentLoadedEventStart(long domContentLoadedEventStart) {
        this.domContentLoadedEventStart = domContentLoadedEventStart;
    }

    public long getDomContentLoadedEventEnd() {
        return domContentLoadedEventEnd;
    }

    public void setDomContentLoadedEventEnd(long domContentLoadedEventEnd) {
        this.domContentLoadedEventEnd = domContentLoadedEventEnd;
    }

    public long getDomComplete() {
        return domComplete;
    }

    public void setDomComplete(long domComplete) {
        this.domComplete = domComplete;
    }

    public long getLoadEventStart() {
        return loadEventStart;
    }

    public void setLoadEventStart(long loadEventStart) {
        this.loadEventStart = loadEventStart;
    }

    public long getLoadEventEnd() {
        return loadEventEnd;
    }

    public void setLoadEventEnd(long loadEventEnd) {
        this.loadEventEnd = loadEventEnd;
    }

    public long getDomainLookupTime() {
        return domainLookupTime;
    }

    public void setDomainLookupTime(long domainLookupTime) {
        this.domainLookupTime = domainLookupTime > 0 ? domainLookupTime : 0;
    }

    public long getSecureConnectionTime() {
        return secureConnectionTime;
    }

    public void setSecureConnectionTime(long secureConnectionTime) {
        this.secureConnectionTime = secureConnectionTime > 0 ? secureConnectionTime : 0;
    }

    public long getTcpExtendTime() {
        return tcpExtendTime;
    }

    public void setTcpExtendTime(long tcpExtendTime) {
        this.tcpExtendTime = tcpExtendTime > 0 ? tcpExtendTime : 0;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime > 0 ? responseTime : 0;
    }

    public long getRequestAllTime() {
        return requestAllTime;
    }

    public void setRequestAllTime(long requestAllTime) {
        this.requestAllTime = requestAllTime > 0 ? requestAllTime : 0;
    }

    public long getHangTime() {
        return hangTime;
    }

    public void setHangTime(long hangTime) {
        this.hangTime = hangTime > 0 ? hangTime : 0;
    }

    public long getDomRanderTime() {
        return domRanderTime;
    }

    public void setDomRanderTime(long domRanderTime) {
        this.domRanderTime = domRanderTime > 0 ? domRanderTime : 0;
    }

    public long getLoadEventTime() {
        return loadEventTime;
    }

    public void setLoadEventTime(long loadEventTime) {
        this.loadEventTime = loadEventTime > 0 ? loadEventTime : 0;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestAPI() {
        return requestAPI;
    }

    public void setRequestAPI(String requestAPI) {
        this.requestAPI = requestAPI;
    }

    public String getHttpUserAgent() {
        return httpUserAgent;
    }

    public void setHttpUserAgent(String httpUserAgent) {
        this.httpUserAgent = httpUserAgent;
    }

    public String getRequestDomains() {
        return requestDomains;
    }

    public void setRequestDomains(String requestDomains) {
        this.requestDomains = requestDomains;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public long getDomParsingTime() {
        return domParsingTime;
    }

    public void setDomParsingTime(long domParsingTime) {
        this.domParsingTime = domParsingTime;
    }

    public long getAllTime() {
        return allTime;
    }

    public void setAllTime(long allTime) {
        this.allTime = allTime;
    }

    public String getRequestUrlNoParameter() {
        return requestUrlNoParameter;
    }

    public void setRequestUrlNoParameter(String requestUrlNoParameter) {
        this.requestUrlNoParameter = requestUrlNoParameter;
    }
}
