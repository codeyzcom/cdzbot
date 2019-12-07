package com.codeyz.middleware.types.file;

import com.codeyz.middleware.types.AType;
import com.codeyz.middleware.types.PhotoSize;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Document implements AType {

    @SerializedName("file_id")
    private String fileId;

    @SerializedName("thumb")
    private PhotoSize thumb;

    @SerializedName("file_name")
    private String fileName;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("file_size")
    private Integer fileSize;

    public static Document fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Document.class);
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
