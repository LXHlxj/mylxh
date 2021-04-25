import com.i.springboot.SpringbootApplication;
import com.i.springboot.contorller.YuanGongContorller;
import com.i.springboot.mapper.UserMapper;
import com.i.springboot.service.Yuangongserviseimpl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootApplication.class)
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
	public void test(){
	    System.out.println("hellotest");

	}
}

