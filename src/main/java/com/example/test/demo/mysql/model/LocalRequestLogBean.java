package com.example.test.demo.mysql.model;


public class LocalRequestLogBean {
    private BaseDeviceInfo baseInfo;
    private NetworkInfo appNetworkInfo;
    /*** web性能数据 ***/
    private WebPerformanceInfo windowPerformanceInfo;
    /*** web单个元素数据 ***/
    private WebResourcesInfo webNetworkInfo;
    /*** webJS错误数据 ***/
    private WebScriptErrorInfo webScriptErrorInfo;
    /*** web页面请求错误数据 ***/
    private WebPageErrorInfo webPageErrorInfo;
    /*** 1、主动上报；2、回捞 ***/
    private int uploadType;
    /*** 2、回捞ID ***/
    private String catchAPMDataId;
    /*** 2、elk添加时间(2018-11-28T02:34:57.838) ***/
    private String addDate;

    public BaseDeviceInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseDeviceInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public NetworkInfo getAppNetworkInfo() {
        return appNetworkInfo;
    }

    public void setAppNetworkInfo(NetworkInfo appNetworkInfo) {
        this.appNetworkInfo = appNetworkInfo;
    }

    public int getUploadType() {
        return uploadType;
    }

    public void setUploadType(int uploadType) {
        this.uploadType = uploadType;
    }

    public String getCatchAPMDataId() {
        return catchAPMDataId;
    }

    public void setCatchAPMDataId(String catchAPMDataId) {
        this.catchAPMDataId = catchAPMDataId;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }
}
