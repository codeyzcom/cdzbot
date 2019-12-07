package com.codeyz.middleware.types;

import com.google.gson.annotations.SerializedName;

public class PhotoSize implements AType {

    @SerializedName("file_id")
    private String fileId;

    private Integer width;
    private Integer height;

    @SerializedName("file_size")
    private Integer fileSize;


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
