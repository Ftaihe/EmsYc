package T20190804;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yuchong.entity.test;
import cn.yuchong.mapper.testMapper;

public class TesttestCase {

	private AbstractApplicationContext ac;
	private testMapper tm;
	
	@Test
	/**
	 * 测试插入操作
	 */
	public void test1() {
		test t = new test();
		t.setTname("201908040130");
		t.setTtxt("测试测试类的添加方法");
		int row = tm.insertTest(t);
		System.out.println("成功执行"+row+"行sql");
	}
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		tm = ac.getBean("testMapper",testMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}
	
}
