package com.munjie.vue.myblog.service;

import com.munjie.vue.myblog.entity.Article;
import com.munjie.vue.myblog.utils.Response;

import java.util.List;

/**
 * @Auther: munjie
 * @Date: 7/28/2020 22:29
 * @Description:
 */
public interface ArticleService {

    Response saveArticle(Article article);

    Article getArticleById(String articleId);

    List<Article> listArticles();
}


