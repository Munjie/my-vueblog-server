package com.munjie.vue.myblog.dao;

import com.munjie.vue.myblog.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: munjie
 * @Date: 7/28/2020 22:33
 * @Description:
 */
@Repository
@SuppressWarnings("all")
public interface ArticleDao {

    int saveArticle(Article article);

    Article getArticleById(String articleId);

    List<Article> listArticles();
}
