package com.kim;

import com.alibaba.fastjson.JSONObject;
import com.kim.mapper.CplDataMapper;
import com.kim.model.CplData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringbootdemomybatisApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private CplDataMapper cplDataMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		CplData cplData = cplDataMapper.findByUid("45470d63fc5d40728e7d58f7d00ad45e");
		System.out.println(JSONObject.toJSONString(cplData));
	}

}
