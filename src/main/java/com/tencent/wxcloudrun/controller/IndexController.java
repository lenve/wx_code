package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.Msg;
import com.tencent.wxcloudrun.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * index控制器
 */
//@RestController

public class IndexController {

    @Autowired
    SearchService searchService;

    public final static Logger logger = LoggerFactory.getLogger(IndexController.class);
    /**
     * 主页页面
     *
     * @return API response html
     */
    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/search")
    public Msg search(@RequestBody Msg msg) {
        logger.info("msg: {}", msg);
        if (msg.getMsgType().equals("text")) {
            return searchService.search(msg);
        } else {
            return null;
        }
    }


}
