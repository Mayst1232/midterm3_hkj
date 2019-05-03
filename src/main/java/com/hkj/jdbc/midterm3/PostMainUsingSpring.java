package com.hkj.jdbc.midterm3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ArticleService를 테스트하는 main
 * 
 * @author Jacob
 */
public class PostMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"post.xml");
		PostService postService = context.getBean("postService",
				PostService.class);
		context.close();
		postService.sweetPost();
 	}

}
