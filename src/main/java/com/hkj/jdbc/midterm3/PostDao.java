package com.hkj.jdbc.midterm3;

import java.util.List;

/**
 * Data Access Object.<br>
 * 데이터베이스에 접속해서 데이터를 조작하는 인터페이스.
 * 
 * @author Jacob
 */
public interface PostDao {

	/**
	 * 목록
	 */
	List<Post> listPosts();

	/**
	 * 조회
	 */
	Post getPost(String postId);

	/**
	 * 등록
	 * 
	 * @return 추가된 행의 갯수
	 */
	int addPost(Post post);

	/**
	 * 수정
	 * 
	 * @return 수정된 행의 갯수
	 */
	int updatePost(Post post);

	int sweetPost(String postId);

}
