package com.munjie.vue.myblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: munjie
 * @Date: 7/24/2020 00:04
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.munjie.vue.myblog.dao")
public class VueBlogApplication {

  public static void main(String[] args) {
      SpringApplication.run(VueBlogApplication.class,args);
    //
  }
}
