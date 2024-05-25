package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.model.Msg;
import com.tencent.wxcloudrun.service.SearchService;
import org.springframework.stereotype.Service;

/**
 * @author：江南一点雨
 * @site：http://www.javaboy.org
 * @微信公众号：江南一点雨
 * @github：https://github.com/lenve
 * @gitee：https://gitee.com/lenve
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Override
    public Msg search(Msg content) {
        Msg msg = new Msg();
        msg.setContent("调试中");
        String fromUserName = content.getFromUserName();
        msg.setFromUserName(content.getToUserName());
        msg.setToUserName(fromUserName);
        return msg;
    }
}
