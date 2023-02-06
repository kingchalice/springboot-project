package com.kingchalice.mywiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://127.0.0.1:8880/hello
@RestController //返回字符串
//@Controller //返回页面
public class TestController {
    /**
     * GET POST PUT DELETE
     * /user?id=1
     * /user/1
     * @return
     * */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
