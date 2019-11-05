package com.codeyz.middleware.method.webhook;

import com.codeyz.middleware.method.Method;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class GetWebHookInfo implements Method {

    private final String METHOD_NAME = "getWebhookInfo";

    private String url;

    @SerializedName("has_custom_certificate")
    private Boolean hasCustomCertificate;

    @SerializedName("pending_update_count")
    private Integer pendingUpdateCount;

    @SerializedName("last_error_date")
    private Integer lastErrorDate;

    @SerializedName("last_error_message")
    private String lastErrorMessage;

    @SerializedName("max_connections")
    private Integer maxConnections;

    @SerializedName("allowed_updates")
    private String[] allowedUpdates;

    @Override
    public String getResult() throws IllegalAccessException {
        return METHOD_NAME;
    }


    public static GetWebHookInfo fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, GetWebHookInfo.class);
    }


    public String getMETHOD_NAME() {
        return METHOD_NAME;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getHasCustomCertificate() {
        return hasCustomCertificate;
    }

    public Integer getPendingUpdateCount() {
        return pendingUpdateCount;
    }

    public Integer getLastErrorDate() {
        return lastErrorDate;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }

    public String[] getAllowedUpdates() {
        return allowedUpdates;
    }
}
