package com.luban.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author luyang
 * @ClassName Test
 * @description 〈功能详细描述〉
 * @time 2019/5/1013:47
 * @modificationHistory <记录修改历史记录 who where what>
 */
@Controller
@ComponentScan("com.luban.demo")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext();
		annotation.register(IndexDao.class);
		annotation.refresh();
		IndexDao indexDao = annotation.getBean(IndexDao.class);
		indexDao.query();
	}
}
