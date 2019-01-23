package com.example.test.demo.mysql.model;

/**
 * <br> ClassName:   WebPageErrorInfo
 * <br> Description: H5页面请求错误
 * <br>
 * <br> @author:      谢文良
 * <br> Date:        2018/12/13 17:43
 */
public class WebPageErrorInfo {
    private String requestId = "";
    private String sortTimeFormat = "";
    private long sortTimeLong;
    private int errorCode;
    private String errorMessage = "";
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

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
