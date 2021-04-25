package com.i.springboot.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.i.springboot.contorller.YuanGongContorller;
import com.i.springboot.mapper.UserMapper;
import com.i.springboot.mode.YuanGong;
import com.i.springboot.service.Yuangongserviseimpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	Yuangongserviseimpl yuangongserviseimpl;
	@Autowired()
	UserMapper usermapper;
	@Autowired
	YuanGongContorller y;
	//	@Test
//	void con() {
//		YuanGong yuanGong=conn.bid(1);
//		System.out.println("名字"+yuanGong.getName());
//	}
	@Autowired
	UserMapper u;
	@Test
	public void th() {

		System.out.println(SpringbootApplicationTests.class.getClass().getName());
		System.out.println(super.getClass().getName()+"@"+Integer.toHexString(hashCode()));
		Page<YuanGong> page=new Page<> (1,5,0,true);
		IPage<YuanGong>iPage=u.selectPage(page,new QueryWrapper<>());
		System.out.println(iPage.getRecords());


	}
}

