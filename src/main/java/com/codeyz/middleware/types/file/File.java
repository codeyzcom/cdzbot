package com.codeyz.middleware.types.file;

import com.codeyz.middleware.types.AType;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class File implements AType {

    @SerializedName("file_id")
    private String fileId;

    @SerializedName("file_size")
    private Integer fileSize;

    @SerializedName("file_path")
    private String filePath;

    public static File fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, File.class);
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
