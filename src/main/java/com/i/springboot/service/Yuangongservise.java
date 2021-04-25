package com.i.springboot.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.i.springboot.mode.Page1;
import com.i.springboot.mode.SelectBean;
import com.i.springboot.mode.Update1;
import com.i.springboot.mode.YuanGong;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface Yuangongservise extends IService<YuanGong> {
    //添加员工
     Object Add(YuanGong yuanGongs);
     //初始化分页数据
     Object queryPage(Page1 page1);
    //高级查询
     Object select(SelectBean bean);
     Object queryname(String name);
     Object querynumber(String number);
     Object queryphone(String phone);
     Object querysfz(String sfz);
     Map<String,Object>likename(String string);
    //修改
     Object update(Update1 update1);
     //删除
    Map<String,Object>delete(String id);

}
