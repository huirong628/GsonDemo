package com.hrong.test.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrong.test.protocol.beans.IBeanAbs;

public class FeedBean extends IBeanAbs {

    public static final String KEY_ID = "id";
    public static final String KEY_AUTHOR_NAME = "author_name";
    public static final String KEY_AUTHOR_HEAD = "author_head";

    @Expose
    @SerializedName(KEY_ID)
    private long id;

    @Expose
    @SerializedName(KEY_AUTHOR_NAME)
    private String authorName;

    @Expose
    @SerializedName(KEY_AUTHOR_HEAD)
    private String authorHead;

    public long getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorHead() {
        return authorHead;
    }
}
