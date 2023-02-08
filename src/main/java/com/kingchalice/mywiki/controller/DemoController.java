package com.kingchalice.mywiki.controller;

import com.kingchalice.mywiki.domain.Demo;
import com.kingchalice.mywiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//http://127.0.0.1:8880/hello
@RestController //返回字符串
//@Controller //返回页面
@RequestMapping("/demo")
public class DemoController {



    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list() {

        return demoService.list();
    }
}
