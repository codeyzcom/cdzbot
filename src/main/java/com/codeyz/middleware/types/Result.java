package com.codeyz.middleware.types;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class Result implements AType {

    @SerializedName("update_id")
    @Expose
    private Integer updateId;
    @SerializedName("message")
    @Expose
    private Message message;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return updateId.equals(result.updateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateId);
    }

    @Override
    public String toString() {
        return "Result{" +
                "updateId=" + updateId +
                ", message=" + message +
                "}\n";
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
}
