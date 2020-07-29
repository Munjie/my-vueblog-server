package com.munjie.vue.myblog.controller;

import com.munjie.vue.myblog.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: munjie
 * @Date: 7/24/2020 00:02
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class LoginController {


    @PostMapping("/login")
    public Object loginUser(User user) {
        Map<String,Object> result = new HashMap<String, Object>();
        System.err.println(user);

            result.put("code", 200);
            result.put("msg", "登录成功");
            result.put("token", "adminxxxx");
            return result;

    }
}
