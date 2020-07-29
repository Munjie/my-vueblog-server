package com.munjie.vue.myblog.entity;

/**
 * @Auther: munjie
 * @Date: 7/26/2020 14:37
 * @Description:
 */
public class Article {

    /*
    * "visits": 436,
    "releasetime": 1567998413000,
    "comment": 0,
    "id": "8ad6b20a6d13eac5016d13f594bc0003",
    "htmlContents": "<div class=\"md-section-divider\"></div><div class=\"md-section-divider\"></div><h1 data-anchor-id=\"tsem\" id=\"vue项目实战个人博客一-项目介绍\">vue项目实战（个人博客）一------项目介绍</h1><p data-anchor-id=\"l4gf\"><code>vue</code></p><p data-anchor-id=\"7gb0\"><img src=\"http://www.photo.guoang.xyz/1567998008955\" alt=\"文章封面\"></p><pre data-anchor-id=\"dcj5\"><code>摘要： 我的csdn博客：https://blog.csdn.net/qq_41154298\n</code></pre><hr><div class=\"md-section-divider\"></div><h2 data-anchor-id=\"lrod\" id=\"前言\">前言</h2><p data-anchor-id=\"d0eb\">  前一段时间开始写这个博客项目，到最近已经完成了，这个项目断断续续花了一个多月的时间，在这个过程中我遇到了不少的坑，我准备写这个专题来来记录这些同时也是记录我学vue的历程。这个专题大概有十几篇把</p><div class=\"md-section-divider\"></div><h2 data-anchor-id=\"rwhg\" id=\"项目介绍\">项目介绍</h2><p data-anchor-id=\"83tr\"><strong>项目技术栈</strong>  <br>\n   前端  <br>\n   后台 <code>js</code>  <code>jquery</code> <br>\n     前台<code>vue</code>  <code>vue-router</code> <code>axios</code> <code>vue-cli</code> <br>\n    后端 <br>\n       <code>java</code>  <code>sprig</code>  <code>mysql</code> <br>\n<strong>环境</strong> <br>\n   服务器用的是<code>阿里云</code>的学生服务器 <br>\n   系统  ：<code>CentOS</code> <br>\n图片存储在<code>七牛云</code>      </p><p data-anchor-id=\"ql4l\"><strong>项目演示</strong> <br>\n   PC端</p><p data-anchor-id=\"6y51\"><img src=\"http://www.photo.guoang.xyz/1567998008955\" alt=\"$}2P9PWO{~DR)}AB_C~@6$5.png-1134.7kB\" title=\"\"> <br>\n平板 <br>\n<img src=\"http://www.photo.guoang.xyz/1567998264480\" alt=\"[图片]\" title=\"\"> <br>\n手机  <br>\n<img src=\"http://www.photo.guoang.xyz/1567998183616\" alt=\"image.png-1687.4kB\" title=\"\"> <br>\n后台 <br>\n<img src=\"http://www.photo.guoang.xyz/1567998353259\" alt=\"image.png-425.7kB\" title=\"\"></p>",
    "title": "vue项目实战（个人博客）一------项目介绍",
    "thumbup": 0*/

    public String id;
    public String articleId;
    public String author;
    public String title;
    public String content;
    public String releaseTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }
}
