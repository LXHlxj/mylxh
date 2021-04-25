package com.i.springboot.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.i.springboot.mapper.UserMapper;
import com.i.springboot.mode.Page1;
import com.i.springboot.mode.SelectBean;
import com.i.springboot.mode.Update1;
import com.i.springboot.mode.YuanGong;
import com.i.springboot.util.IdCardUtil;
import com.i.springboot.util.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class Yuangongserviseimpl extends ServiceImpl<UserMapper,YuanGong> implements Yuangongservise {

@Autowired
UserMapper usermapper;
@Autowired
Yuangongservise yuangongservise;

    @Override
    public Object Add( YuanGong yuanGongs) {
        Map<String, Object> map1 = new HashMap<>();
        IdCardUtil idCardUtil=  new IdCardUtil();
        Phone phone= new Phone();
        if (idCardUtil.validate18Idcard(yuanGongs.getSfz())&&phone.isMobileNO(yuanGongs.getPhone())) {
            Random r = new Random();
            Object o =(String) "L" + 1000 + r.nextInt(999);
            List<YuanGong> list = yuangongservise.list();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNumber().equals(o)) {
                    o = "L" + 1000 + r.nextInt(999);
                } else
                    yuanGongs.setNumber((String)o);
                break;
            }
            try {
                if (usermapper.insert(yuanGongs) != 0) {
                    map1.put("msg","添加成功" );
                    map1.put("code", 0);
                    return map1;
                }
            } catch (Exception e) {
            }
        }
        map1.put("msg","添加失败查看是否输入合法");
        map1.put("code",1);
        return map1;
    }

    @Override
    public Map<String, Object> queryPage(Page1 page1) {
        Page<YuanGong> page=new Page<> (page1.getPage(),page1.getLimit());
        IPage<YuanGong> iPage=usermapper.selectPage(page,new QueryWrapper<>());
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("data",iPage.getRecords());
        map.put("count",iPage.getTotal());
        map.put("msg","请求成功" );
        return map;

    }

    @Override
    public Object select(SelectBean bean) {
        Map<String, Object>map1=null;
        String s=bean.getType();
        switch (s){
            case "1":
                map1=(Map<String, Object>)querynumber(bean.getDatavalue());
                return map1;
            case "2":
                map1=(Map<String, Object>)queryname(bean.getDatavalue());
                return map1;
            case "3":
                map1=(Map<String, Object>)querysfz(bean.getDatavalue());
                return map1;
            case "4":
                map1=(Map<String, Object>)queryphone(bean.getDatavalue());
                return map1;
            default:
        }
        map1.put("msg", "你没有选者");
        map1.put("code", 1);
        return map1;
    }

    @Override
    public Object queryname(String name) {
        Map<String,Object> map1=new HashMap<>();
        List<YuanGong> yuanGongList=usermapper.queryname(name);
        Object[]objects2=new Object[yuanGongList.size()];
        int i = 0;
       for (System.out.println(i); i <yuanGongList.size() ; System.out.println(i)) {
            objects2[i]=yuanGongList.get(i);
            i++;
        }
        if (yuanGongList.size()!=0) {
            map1.put("leng", objects2.length);
            map1.put("data", objects2);
            map1.put("code",0);
            map1.put("msg", "请求成功");
            return map1;
        }else
            map1.put("msg", "没有此员工信息");
        map1.put("code", 2);
        return map1;
    }

    @Override
    public Object querynumber(String number) {
        Map<String,Object> map1=new HashMap<>();
        YuanGong yuanGong=usermapper.querynumber(number);
        Object[]objects1={yuanGong};
        if (yuanGong!=null) {
            map1.put("leng", objects1.length);
            map1.put("data",objects1);
            map1.put("msg", "请求成功");
            map1.put("code", 0);
            return map1;
        }
        else
            map1.put("msg", "没有此员工信息");
        map1.put("code", 2);
        return map1;
    }

    @Override
    public Object queryphone(String phone) {
        Map<String,Object> map1=new HashMap<>();
      YuanGong  yuanGong=usermapper.queryphone(phone);
        Object[]d={yuanGong};
        if (yuanGong!=null){
            map1.put("leng", d.length);
            map1.put("data",d);
            map1.put("msg", "请求成功");
            map1.put("code", 0);
            return map1;
        }else
            map1.put("msg", "没有此员工信息");
        map1.put("code", 2);
        return map1;
    }

    @Override
    public Map<String,Object> querysfz(String sfz) {
        Map<String,Object> map1=new HashMap<>();
      YuanGong yuanGong= usermapper.querysfz(sfz);
        Object[]objects3={yuanGong};
        if (yuanGong!=null){
            map1.put("leng", objects3.length);
            map1.put("data",objects3);
            map1.put("code", 0);
            map1.put("msg", "请求成功");
            return map1;
        }else
            map1.put("msg", "没有此员工信息");
        map1.put("code", 2);
        return map1;
    }

    /**
     *
     * @return
     */
    @Override
    public Map<String, Object> likename(String s) {
        Map<String,Object>map=new HashMap<>();
       List<YuanGong>likename= usermapper.likename(s);

        return map;
    }

    @Override
    public Object update(Update1 update1) {
        Map<String, Object> updaate = new HashMap<>();
        if(update1.getGonzi().length()!=0&&update1.getPhone().length()!=0) {
            int v = usermapper.update(update1);
            try {
                if (v!=0) {
                    updaate.put("msg", "修改成功");
                    updaate.put("code", 0);
                    return updaate;
                }
            } catch (Exception e) {
            }
        }else
            updaate.put("msg","修改失败不能为空");
        updaate.put("code",1);
        return updaate;
    }

    @Override
    public Map<String, Object> delete(String id) {
        Map<String,Object>map=new HashMap<>();
        if(usermapper.deleteById(id)!=0){
            map.put("code",1);
            map.put("msg","删除 员工成功");
            return map;
        }else
            map.put("code",0);
        map.put("msg","删除失败");
        return map;
    }


}
