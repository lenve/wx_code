package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * index控制器
 */
@RestController

public class IndexController {

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
    public String search(@RequestBody Msg msg) {
        return msg.getContent();
    }


}
