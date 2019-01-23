package com.example.test.demo.mysql.model;

public class WebResourcesInfo {

    /**
     * name : http://10.100.98.250:3000/css/coupon.css
     * entryType : resource
     * startTime : 806.8100000000001
     * duration : 28.899999999999977
     * initiatorType : link
     * workerStart : 0
     * redirectStart : 0
     * redirectEnd : 0
     * fetchStart : 806.8100000000001
     * domainLookupStart : 806.8100000000001
     * domainLookupEnd : 806.8100000000001
     * connectStart : 806.8100000000001
     * connectEnd : 806.8100000000001
     * secureConnectionStart : 0
     * requestStart : 819.0350000000001
     * responseStart : 833.9900000000001
     * responseEnd : 835.71
     */

    private String requestId = "";
    private String sortTimeFormat = "";
    private long sortTimeLong;
    private String name = "";
    private String entryType = "";
    private double startTime;
    private double duration;
    private String initiatorType = "";
    private String nextHopProtocol = "";
    private double workerStart;
    private double redirectStart;
    private double redirectEnd;
    private double fetchStart;
    private double domainLookupStart;
    private double domainLookupEnd;
    private double domainLookupTime;
    private double connectStart;
    private double connectEnd;
    private double secureConnectionStart;
    private double tcpExtendTime;
    private double secureConnectionTime;
    private double requestStart;
    private double requestTime;
    private double responseStart;
    private double responseEnd;
    private double responseTime;
    private double requestAllTime;
    private double transferSize;
    private double encodedBodySize;
    private double decodedBodySize;
    private String sessionId = "";
    private String requestUrl = "";
    private String requestAPI = "";
    private String httpUserAgent = "";
    private String requestDomains = "";
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getInitiatorType() {
        return initiatorType;
    }

    public void setInitiatorType(String initiatorType) {
        this.initiatorType = initiatorType;
    }

    public String getNextHopProtocol() {
        return nextHopProtocol;
    }

    public void setNextHopProtocol(String nextHopProtocol) {
        this.nextHopProtocol = nextHopProtocol;
    }

    public double getWorkerStart() {
        return workerStart;
    }

    public void setWorkerStart(double workerStart) {
        this.workerStart = workerStart;
    }

    public double getRedirectStart() {
        return redirectStart;
    }

    public void setRedirectStart(double redirectStart) {
        this.redirectStart = redirectStart;
    }

    public double getRedirectEnd() {
        return redirectEnd;
    }

    public void setRedirectEnd(double redirectEnd) {
        this.redirectEnd = redirectEnd;
    }

    public double getFetchStart() {
        return fetchStart;
    }

    public void setFetchStart(double fetchStart) {
        this.fetchStart = fetchStart;
    }

    public double getDomainLookupStart() {
        return domainLookupStart;
    }

    public void setDomainLookupStart(double domainLookupStart) {
        this.domainLookupStart = domainLookupStart;
    }

    public double getDomainLookupEnd() {
        return domainLookupEnd;
    }

    public void setDomainLookupEnd(double domainLookupEnd) {
        this.domainLookupEnd = domainLookupEnd;
    }

    public double getConnectStart() {
        return connectStart;
    }

    public void setConnectStart(double connectStart) {
        this.connectStart = connectStart;
    }

    public double getConnectEnd() {
        return connectEnd;
    }

    public void setConnectEnd(double connectEnd) {
        this.connectEnd = connectEnd;
    }

    public double getSecureConnectionStart() {
        return secureConnectionStart;
    }

    public void setSecureConnectionStart(double secureConnectionStart) {
        this.secureConnectionStart = secureConnectionStart;
    }

    public double getRequestStart() {
        return requestStart;
    }

    public void setRequestStart(double requestStart) {
        this.requestStart = requestStart;
    }

    public double getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(double requestTime) {
        this.requestTime = requestTime > 0 ? requestTime : 0;
    }

    public double getResponseStart() {
        return responseStart;
    }

    public void setResponseStart(double responseStart) {
        this.responseStart = responseStart;
    }

    public double getResponseEnd() {
        return responseEnd;
    }

    public void setResponseEnd(double responseEnd) {
        this.responseEnd = responseEnd;
    }

    public double getDomainLookupTime() {
        return domainLookupTime;
    }

    public void setDomainLookupTime(double domainLookupTime) {
        this.domainLookupTime = domainLookupTime > 0 ? domainLookupTime : 0;
    }

    public double getTcpExtendTime() {
        return tcpExtendTime;
    }

    public void setTcpExtendTime(double tcpExtendTime) {
        this.tcpExtendTime = tcpExtendTime > 0 ? tcpExtendTime : 0;
    }

    public double getSecureConnectionTime() {
        return secureConnectionTime;
    }

    public void setSecureConnectionTime(double secureConnectionTime) {
        this.secureConnectionTime = secureConnectionTime > 0 ? secureConnectionTime : 0;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(double responseTime) {
        this.responseTime = responseTime > 0 ? responseTime : 0;
    }

    public double getRequestAllTime() {
        return requestAllTime;
    }

    public void setRequestAllTime(double requestAllTime) {
        this.requestAllTime = requestAllTime > 0 ? requestAllTime : 0;
    }

    public double getTransferSize() {
        return transferSize;
    }

    public void setTransferSize(double transferSize) {
        this.transferSize = transferSize;
    }

    public double getEncodedBodySize() {
        return encodedBodySize;
    }

    public void setEncodedBodySize(double encodedBodySize) {
        this.encodedBodySize = encodedBodySize;
    }

    public double getDecodedBodySize() {
        return decodedBodySize;
    }

    public void setDecodedBodySize(double decodedBodySize) {
        this.decodedBodySize = decodedBodySize;
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

    public String getRequestUrlNoParameter() {
        return requestUrlNoParameter;
    }

    public void setRequestUrlNoParameter(String requestUrlNoParameter) {
        this.requestUrlNoParameter = requestUrlNoParameter;
    }
}
