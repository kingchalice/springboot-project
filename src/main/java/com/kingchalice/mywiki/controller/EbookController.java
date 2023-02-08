package com.kingchalice.mywiki.controller;

import com.kingchalice.mywiki.domain.Ebook;
import com.kingchalice.mywiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//http://127.0.0.1:8880/hello
@RestController //返回字符串
//@Controller //返回页面
@RequestMapping("/ebook")
public class EbookController {



    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public List<Ebook> list() {

        return ebookService.list();
    }
}
