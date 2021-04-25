package com.i.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.i.springboot.mode.UserHr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HrMapper extends BaseMapper<UserHr> {
  public UserHr login(@Param("username") String username, @Param("password") String password);
}
