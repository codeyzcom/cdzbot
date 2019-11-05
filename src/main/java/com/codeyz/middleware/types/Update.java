package com.codeyz.middleware.types;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Update implements AType {

    @SerializedName("update_id")
    private Integer updateId;

    private Message message;

    @SerializedName("edited_message")
    private Message editedMessage;

    @SerializedName("channel_post")
    private Message channelPost;

    @SerializedName("edited_channel_post")
    private Message editedChannelPost;


    public static Update fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Update.class);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Update update = (Update) o;
        return updateId.equals(update.updateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId);
    }

    @Override
    public String toString() {
        return "ToString: Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", editedMessage=" + editedMessage +
                ", channelPost=" + channelPost +
                ", editedChannelPost=" + editedChannelPost +
                '}';
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }
}
