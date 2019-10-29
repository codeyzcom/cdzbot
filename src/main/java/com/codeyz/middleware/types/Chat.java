package com.codeyz.middleware.types;

import com.google.gson.Gson;

import java.util.Objects;

public class Chat {

    private Integer id;
    private String type;
    private String username;
    private String first_name;
    private String last_name;
    // ToDo private ChatPhoto photo;
    private String description;
    private String invite_link;
    // ToDo private ChatPermissions permissions;
    private String sticker_set_name;
    private Boolean can_set_sticker_set;

    public Chat(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return id.equals(chat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", description='" + description + '\'' +
                ", invite_link='" + invite_link + '\'' +
                ", sticker_set_name='" + sticker_set_name + '\'' +
                ", can_set_sticker_set=" + can_set_sticker_set +
                '}';
    }

    public static Chat fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Chat.class);
    }

    public Object fromJson() {
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(String invite_link) {
        this.invite_link = invite_link;
    }

    public String getSticker_set_name() {
        return sticker_set_name;
    }

    public void setSticker_set_name(String sticker_set_name) {
        this.sticker_set_name = sticker_set_name;
    }

    public Boolean getCan_set_sticker_set() {
        return can_set_sticker_set;
    }

    public void setCan_set_sticker_set(Boolean can_set_sticker_set) {
        this.can_set_sticker_set = can_set_sticker_set;
    }
}
