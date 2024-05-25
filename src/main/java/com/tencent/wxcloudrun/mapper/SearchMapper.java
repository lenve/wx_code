package com.tencent.wxcloudrun.mapper;

import com.tencent.wxcloudrun.model.ResContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author：江南一点雨
 * @site：http://www.javaboy.org
 * @微信公众号：江南一点雨
 * @github：https://github.com/lenve
 * @gitee：https://gitee.com/lenve
 */
@Mapper
public interface SearchMapper {
    @Select(value = "select * from javavideo where keywords like concat('%',#{keywords},'%')")
    ResContent search(String keywords);
}
