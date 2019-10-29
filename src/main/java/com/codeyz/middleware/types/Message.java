package com.codeyz.middleware.types;

import com.google.gson.Gson;

import java.util.Objects;

public class Message implements AType {

    private Integer message_id;
    private User from;
    private Integer date;
    private Chat chat;
    private User forward_from;
    private Chat forward_from_chat;
    // ToDo rest of class


    public Message(Integer message_id, User from, Integer date, Chat chat) {
        this.message_id = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return message_id.equals(message.message_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message_id);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                '}';
    }

    public static Message fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Message.class);
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
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

    public User getForward_from() {
        return forward_from;
    }

    public void setForward_from(User forward_from) {
        this.forward_from = forward_from;
    }

    public Chat getForward_from_chat() {
        return forward_from_chat;
    }

    public void setForward_from_chat(Chat forward_from_chat) {
        this.forward_from_chat = forward_from_chat;
    }


}
