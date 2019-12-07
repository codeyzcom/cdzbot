package com.codeyz.middleware.types;

import com.codeyz.middleware.types.file.Audio;
import com.codeyz.middleware.types.file.Document;
import com.codeyz.middleware.types.file.Voice;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Message implements AType {

    @SerializedName("message_id")
    private Integer messageId;
    private User from;
    private Integer date;
    private Chat chat;

    @SerializedName("forward_from")
    private User forwardFrom;

    @SerializedName("forward_from_chat")
    private Chat forwardFromChat;

    private String text;
    private Audio audio;
    private Document document;
    private Voice voice;
    // ToDo rest of class


    public Message(Integer message_id, User from, Integer date, Chat chat) {
        this.messageId = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return messageId.equals(message.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + messageId +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forward_from=" + forwardFrom +
                ", forward_from_chat=" + forwardFromChat +
                ", text='" + text + '\'' +
                ", audio=" + audio +
                ", document=" + document +
                ", voice=" + voice +
                '}';
    }

    public static Message fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Message.class);
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public void setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public void setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }
}
