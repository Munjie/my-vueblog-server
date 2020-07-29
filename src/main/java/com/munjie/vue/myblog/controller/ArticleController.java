package com.munjie.vue.myblog.controller;

import com.munjie.vue.myblog.entity.Article;
import com.munjie.vue.myblog.service.ArticleService;
import com.munjie.vue.myblog.utils.FileUtil;
import com.munjie.vue.myblog.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: munjie
 * @Date: 7/26/2020 12:07
 * @Description: 文章接口
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleService articleService;

    @PostMapping("/listArticles")
    public Response listArticles() {

        List<Article> articles = articleService.listArticles();
        return Response.ok(articles,articles.size());

    }



    @GetMapping("/detail")
    public Response listArticles(String articleId) {
        Article articleById = articleService.getArticleById(articleId);

        return Response.ok(articleById);


    }

    /** 文章编辑本地上传图片 */
    @PostMapping("/upload")
    public Response uploadImage(HttpServletRequest request, HttpServletResponse response, MultipartFile file) {
        String fileUrl ="";
        try {
            request.setCharacterEncoding("utf-8");
            // 设置返回头后页面才能获取返回url
            response.setHeader("X-Frame-Options", "SAMEORIGIN");
            fileUrl = FileUtil.upload(file);

        } catch (Exception e) {
            try {
                response.getWriter().write("{\"success\":0}");
            } catch (IOException e1) {
               LOGGER.error("",e1);
               return Response.error("上传图片失败",1006);
            }
        }
        return Response.ok(fileUrl);
    }

    /** 发布文章 */
    @PostMapping("/release")
    public Response uploadImage(Article article) {

       return articleService.saveArticle(article);

    }

}
