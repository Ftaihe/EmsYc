package cn.yuchong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yuchong.entity.test;
import cn.yuchong.mapper.testMapper;

@Controller
@RequestMapping("/test")
public class testController {

	@Autowired
	testMapper tm;
	
	@ResponseBody
	@RequestMapping(value="/test.act",produces="text/html;charset=UTF-8")
	public String test(@RequestParam("Tname") String tname,@RequestParam("Ttxt") String ttxt) {
		test t = new test();
		t.setTname(tname);
		t.setTtxt(ttxt);
		int row = tm.insertTest(t);
		return "成功执行"+row+"行sql";
	}
	
}
