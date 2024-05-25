package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.mapper.SearchMapper;
import com.tencent.wxcloudrun.model.Msg;
import com.tencent.wxcloudrun.model.ResContent;
import com.tencent.wxcloudrun.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;

/**
 * @author：江南一点雨
 * @site：http://www.javaboy.org
 * @微信公众号：江南一点雨
 * @github：https://github.com/lenve
 * @gitee：https://gitee.com/lenve
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    SearchMapper searchMapper;
    @Override
    public Msg search(Msg content) {
        Msg msg = new Msg();
        String fromUserName = content.getFromUserName();
        msg.setFromUserName(content.getToUserName());
        msg.setToUserName(fromUserName);
        msg.setMsgType("text");
        msg.setCreateTime(System.currentTimeMillis());
        ResContent rc = searchMapper.search(content.getContent().trim());
        if(rc == null) {
            msg.setContent("没有找到相关内容，请检查查询关键字是否正确。<br/><br/><a href='https://mp.weixin.qq.com/s/9-DQdfN8GQ2cvGwy-T3DwA'>Spring源码课程</a><br/><br/><a href='https://mp.weixin.qq.com/s/0HAtKqwILw9QHLqi5QoW_w'>TienChin项目实战课程</a><br/><br/><a href='https://mp.weixin.qq.com/s/a7CvhHcnRuJQ-gEDFQNhsQ'>Spring Security6+OAuth2 视频课程</a><br/><br/><a href='https://mp.weixin.qq.com/s/I3PnA67oQHTKHDYbAw8yMg'>Spring Boot3+Vue3 项目实战</a><br/><br/><a href='https://mp.weixin.qq.com/s/zyHDFbptLithqrVeDtjhOw'>2024 Java 进阶训练营</a>");
        } else {
            msg.setContent(rc.getContent());
        }
        return msg;
    }
}
