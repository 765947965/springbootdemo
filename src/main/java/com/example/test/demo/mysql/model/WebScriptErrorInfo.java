package com.example.test.demo.mysql.model;

public class WebScriptErrorInfo {
    private String requestId = "";
    private String sortTimeFormat = "";
    private long sortTimeLong;
    private String errorMessage = "";
    private String scriptUrl = "";
    private int lineNumber;
    private int columnNumber;
    private String errorObj = "";
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

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getScriptUrl() {
        return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public String getErrorObj() {
        return errorObj;
    }

    public void setErrorObj(String errorObj) {
        this.errorObj = errorObj;
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
