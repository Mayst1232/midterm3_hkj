package com.hkj.jdbc.midterm3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Spring JDBC를 사용해서 ArticleDao를 구현
 * 
 * @author Jacob
 */

@Repository("postDao")
public class PostDaoImplUsingSpringJdbc implements PostDao {
	/**
	 * 목록 가져오는 sql
	 */
	static final String LIST_POSTS = "SELECT userId, name, content, cdate FROM post LIMIT 50";

	/**
	 * 글 1개 가져오는 sql
	 */
	static final String GET_POST = "SELECT userId, name, content, cdate FROM post WHERE postId=?";

	/**
	 * 글 등록하는 sql
	 */
	static final String ADD_POST = "INSERT INTO post(userId, name, content) VALUES (?,?,?)";

	/**
	 * 글 수정하는 sql
	 */
	static final String UPDATE_POST = "UPDATE post SET name=?, content=? WHERE userId=?";

	/**
	 * 글 삭제하는 sql
	 */
	static final String DELETE_POST = "DELETE FROM post WHERE postId=?";
	
	static final String SWEET_POST = "UPDATE post SET sweet=sweet+1 where postId=?";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 글 목록
	 */
	@Override
	public List<Post> listPosts() {
		return jdbcTemplate.query(LIST_POSTS,
				new BeanPropertyRowMapper<>(Post.class));
	}

	/**
	 * 글 상세
	 */
	@Override
	public Post getPost(String postId) {
		return jdbcTemplate.queryForObject(GET_POST,
				new BeanPropertyRowMapper<>(Post.class), postId);
	}

	/**
	 * 글 등록
	 */
	
	@Override
	public int addPost(Post post) {
		return jdbcTemplate.update(ADD_POST, post.getUserId(),
				post.getName(), post.getContent());
	}

	/**
	 * 글 수정
	 */
	@Override
	public int updatePost(Post post) {
		return jdbcTemplate.update(UPDATE_POST, post.getUserId(),
				post.getName(), post.getContent());
	}

	@Override
	public int sweetPost(String postId) {
		return jdbcTemplate.update(SWEET_POST, postId);
	}
	
	
}
