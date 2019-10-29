package com.codeyz.middleware.types;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Update implements AType {

    @SerializedName("ok")
    @Expose
    private Boolean ok;
    @SerializedName("result")
    private List<Result> result = null;
    // ToDo rest of class


    public static Update fromJson(String json) {
        Gson g = new Gson();
        return g.fromJson(json, Update.class);
    }

    @Override
    public String toString() {
        return "Update{" +
                "ok=" + ok +
                ", result=" + result +
                "} \n";
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

}
