package com.csdn.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.csdn.domain.TBlog;
import com.csdn.service.TBlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/tBlog")
public class TBlogContrller {

    @Resource
    private TBlogService tBlogService;

    @GetMapping("/staticQuery")
    public String staticQuery(){
        return tBlogService.staticQuery();
    }

    @GetMapping("/dynamicPageQuery")
    public String dynamicPageQuery(){
        return tBlogService.dynamicPageQuery(null, null, null).toString();
    }
}
