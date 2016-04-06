package com.hrong.test.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.hrong.test.protocol.beans.RetBaseBean;

import java.util.List;

/**
 * Created by zhanghuirong on 2016/3/25.
 */
public class FeedListBean extends RetBaseBean {

    public static final String KEY_TOPIC_FEED_LIST = "topic_post";

    @Expose
    @SerializedName(KEY_TOPIC_FEED_LIST)
    private List<FeedBean> feedList;


    public List<FeedBean> getFeedList() {
        return this.feedList;
    }

    public void setFeedList(List<FeedBean> feedList) {
        this.feedList = feedList;
    }
}
