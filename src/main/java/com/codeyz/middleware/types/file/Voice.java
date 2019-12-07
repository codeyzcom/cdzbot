package com.codeyz.middleware.types.file;

import com.codeyz.middleware.types.AType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Voice implements AType {

    @SerializedName("file_id")
    private String fileId;

    @SerializedName("duration")
    private Integer duration;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("file_size")
    private Integer fileSize;

    public static Voice fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Voice.class);
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
