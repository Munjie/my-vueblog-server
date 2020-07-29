package com.munjie.vue.myblog.service.impl;

import com.munjie.vue.myblog.dao.ArticleDao;
import com.munjie.vue.myblog.entity.Article;
import com.munjie.vue.myblog.service.ArticleService;
import com.munjie.vue.myblog.utils.DateUtil;
import com.munjie.vue.myblog.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: munjie
 * @Date: 7/28/2020 22:32
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public List<Article> listArticles() {
        return articleDao.listArticles();
    }

    @Override
    public Article getArticleById(String articleId) {
        return articleDao.getArticleById(articleId);
    }

    @Override
    public Response saveArticle(Article article) {
        article.setArticleId(DateUtil.getId());
        article.setReleaseTime(DateUtil.getDateNow());
        int i = articleDao.saveArticle(article);
        return Response.ok();
    }
}
