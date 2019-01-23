package com.example.test.demo.mysql.model;

public class BaseDeviceInfo {

    /**
     * AppId : com.tuandai.apm.app
     * AppVersion : 1.0.0
     * ConnectType : 4G
     * CpuFramework :
     * DeviceBrand : unknown
     * DeviceId : IMEI1:
     * DeviceModel : Android SDK built for x86_64
     * IsRoot : false
     * NetworkOperatorName : 四军 WIFI
     * NetworkType : LTE
     * SdkVersion :
     * SystemRom : Android
     * UserId : tdwapm_1001
     * VersionRelease : 6.0
     */

    /*** 应用名称/包名(com.junte) ***/
    private String appId;
    /*** app的版本号 ***/
    private String appVersion;
    /*** 网络类型 ***/
    private String connectType;
    /*** cpu架构(arm64-v8a) ***/
    private String cpuFramework;
    /*** 设备品牌 ***/
    private String deviceBrand;
    /*** 设备ID ***/
    private String deviceId;
    /*** 手机型号 ***/
    private String deviceModel;
    /*** 是否ROOT/越狱(true) ***/
    private boolean isRoot;
    /*** 网络运营商名称 ***/
    private String networkOperatorName;
    /*** 移动网络类型 ***/
    private String networkType;
    /*** sdk版本号 ***/
    private String sdkVersion;
    /*** 系统ROM(可无)(flyme 7.0.1)(暂定iOS 传) ***/
    private String systemRom;
    /*** 用户编号 ***/
    private String userId;
    /*** 系统版本 ***/
    private String versionRelease;
    /*** 设备类型：1、苹果；2、安卓；3、其它 ***/
    private int deviceType;
    /*** 回捞消息推送ID ***/
    private String registrationId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getConnectType() {
        return connectType;
    }

    public void setConnectType(String connectType) {
        this.connectType = connectType;
    }

    public String getCpuFramework() {
        return cpuFramework;
    }

    public void setCpuFramework(String cpuFramework) {
        this.cpuFramework = cpuFramework;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean root) {
        isRoot = root;
    }

    public String getNetworkOperatorName() {
        return networkOperatorName;
    }

    public void setNetworkOperatorName(String networkOperatorName) {
        this.networkOperatorName = networkOperatorName;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getSystemRom() {
        return systemRom;
    }

    public void setSystemRom(String systemRom) {
        this.systemRom = systemRom;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVersionRelease() {
        return versionRelease;
    }

    public void setVersionRelease(String versionRelease) {
        this.versionRelease = versionRelease;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
}
