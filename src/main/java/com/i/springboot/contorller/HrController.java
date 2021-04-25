package com.i.springboot.contorller;

import com.i.springboot.mapper.UserMapper;
import com.i.springboot.mode.*;

import com.i.springboot.service.Hrserviseimpl;
import com.i.springboot.service.Yuangongserviseimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class HrController {
    @Autowired
    Hrserviseimpl hrserviseimp;
    @Autowired
    Yuangongserviseimpl yuangongserviseimpl;
    @Autowired
    UserMapper userMapper;

    /**
     *
     * @param u
     * @param p
     * @return
     */
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/submit")
    public Object main(@RequestParam("u") String u,@RequestParam("p")String p)  {
        Map<String, Object> map=hrserviseimp.login(u, p);
        return map;
    }
    /*
    * 初始化分页数据*/

    /**
     *
     * @param page1
     * @return
     */
    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("page")
    @ResponseBody
    public Object Page(Page1 page1){
      Map<String,Object> map= yuangongserviseimpl.queryPage(page1);
          return map;
    }
//删除

    /**
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteid")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public Object ss(@RequestParam("id") String id){
        Map<String,Object>map=yuangongserviseimpl.delete(id);
        return map;
    }

    /**
     *
     * @param yuanGong
     * @return
     */
    @ResponseBody
    @PostMapping("/addwork")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public Object add(YuanGong yuanGong){
        return yuangongserviseimpl.Add(yuanGong);
    }
/*
* @
* 高级查询*/

    /**
     *
     * @param bean
     * @return
     */
    @ResponseBody
    @PostMapping("/selecta")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public Object select(SelectBean bean){
        return yuangongserviseimpl.select(bean);
    }
    //修改

    /**
     *
     * @param update1
     * @return
     */
    @ResponseBody
    @PostMapping("/update")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public Object update(Update1 update1){
        return yuangongserviseimpl.update(update1);
    }

}
