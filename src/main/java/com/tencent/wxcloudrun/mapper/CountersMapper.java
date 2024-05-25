package com.tencent.wxcloudrun.mapper;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.ResContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountersMapper {

  Counter getCounter(@Param("id") Integer id);

  void upsertCount(Counter counter);

  void clearCount(@Param("id") Integer id);

  @Select(value = "select * from javavideo where keywords like concat('%',#{keywords},'%')")
  ResContent search(String keywords);
}
