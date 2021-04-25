package com.i.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.i.springboot.mode.Page1;
import com.i.springboot.mode.Update1;
import com.i.springboot.mode.YuanGong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
@Mapper
public interface UserMapper extends BaseMapper<YuanGong> {
    YuanGong id(Integer id);
    YuanGong byname(String name);
    Integer Add( List<YuanGong> yuanGongs);
    List<YuanGong> queryall();
    List<YuanGong>queryPage(Page1 page1);
    List<YuanGong> queryname(String name);
    YuanGong querynumber(String number);
    YuanGong queryphone(String phone);
    YuanGong querysfz(String sfz);
    List<YuanGong>likename(String name);
    //根据工号修改
    int update(Update1 update1);

}
