package com.codeyz.middleware.types.file;

import com.codeyz.middleware.types.AType;
import com.codeyz.middleware.types.PhotoSize;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Audio implements AType {

    @SerializedName("file_id")
    private String fileId;
    private Integer duration;
    private String performer;
    private String title;

    @SerializedName("mime_type")
    private String mimeType;

    @SerializedName("file_size")
    private Integer fileSize;

    private PhotoSize thumb;

    public static Audio fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Audio.class);
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

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public PhotoSize getThumb() {
        return thumb;
    }

    public void setThumb(PhotoSize thumb) {
        this.thumb = thumb;
    }
}
