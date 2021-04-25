package com.i.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.i.springboot.config.Erro;
import com.i.springboot.mapper.HrMapper;
import com.i.springboot.mode.UserHr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;



@Service
public class Hrserviseimpl extends ServiceImpl<HrMapper,UserHr> implements Herservise{
    @Autowired
    HrMapper hrmapper;

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Map<String, Object> login(String username, String password) {
        UserHr userHr =hrmapper.login(username, password);
        Map<String, Object> map = new HashMap<>();
        if (userHr != null) {
            if (userHr.getUsername().equals(username) && userHr.getPassword().equals(password)) {
                String msg = "管理员" + userHr.getUsername() + "你好!";
                map.put("msg", msg);
                map.put("code", 0);
                return map;
            }
        }
        String s = new Erro().erro();
        map.put("msg", "密码或账号错误");
        map.put("code", 1);
        return map;
    }


}
