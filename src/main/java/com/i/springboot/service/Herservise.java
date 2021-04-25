package com.i.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.i.springboot.mode.UserHr;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public interface Herservise extends IService<UserHr> {
    //管理员登陆
    Map<String, Object> login(String username, String password);

}
