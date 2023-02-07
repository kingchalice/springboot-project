package com.kingchalice.mywiki.controller;

import com.kingchalice.mywiki.domain.Test;
import com.kingchalice.mywiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//http://127.0.0.1:8880/hello
@RestController //返回字符串
//@Controller //返回页面
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! " + testHello;
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name) {
        return "Hello World!Post:" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {

        return testService.list();
    }
}
