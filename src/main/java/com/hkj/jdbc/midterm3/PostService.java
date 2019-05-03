package com.hkj.jdbc.midterm3;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * articleDao를 사용해서 글 목록, 조회, 추가, 수정, 삭제를 한다.
 * 
 * @author Jacob
 */

@Service("postService")
public class PostService {
	
	Logger logger = LogManager.getLogger();
	
	@Autowired
	PostDao postDao;

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	/**
	 * 글 목록
	 */
	public void listPosts() {
		List<Post> posts = postDao.listPosts();
		System.out.println(posts);
	}

	/**
	 * 글 조회
	 */
	public void sweetPost() {
		postDao.sweetPost("22");
		Post post = postDao.getPost("30");
		logger.debug(post);
		System.out.println("글을 추천했습니다.");
	}

	/**
	 * 글 등록
	 */
	public void addPost() {
		Post post = new Post();
		post.setUserId("22");
		post.setName("황규정");
		post.setContent("시험이 종료되었습니다.");
		if (postDao.addPost(post) > 0)
			System.out.println("글을 추가했습니다.");
		else
			System.out.println("글을 추가하지 못했습니다.");
	}

	/**
	 * 글 수정
	 */
}
