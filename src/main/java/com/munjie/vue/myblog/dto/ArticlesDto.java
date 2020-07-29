package com.munjie.vue.myblog.dto;

import java.io.Serializable;

/**
 * @Auther: munjie
 * @Date: 7/26/2020 14:39
 * @Description:
 */
public class ArticlesDto implements Serializable {
/*
    "id": "8ad6b20a6d13eac5016d13f594bc0003",
            "columnid": "vue项目实战",
            "title": "vue项目实战（个人博客）一------项目介绍",
            "summary": "摘要： 我的csdn博客：https://blog.csdn.net/qq_41154298\n",
            "image": "http://www.photo.guoang.xyz/1567998008955",
            "updatetime": 1567998413000,
            "releasetime": 1567998413000,
            "ispublic": "1",
            "istop": "1",
            "visits": 432,
            "thumbup": 0,
            "comment": 0,
            "label": "vue"*/

    private String id;
    private String columnid;
    private String title;
    private String summary;
    private String image;
    private String updatetime;
    private String releasetime;
    private String ispublic;
    private String istop;
    private int visits;
    private String thumbup;
    private int comment;
    private String label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColumnid() {
        return columnid;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
