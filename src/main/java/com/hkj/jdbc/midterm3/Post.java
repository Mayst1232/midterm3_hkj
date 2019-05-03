package com.hkj.jdbc.midterm3;

/**
 * Article 도메인 오브젝트.<br>
 * 데이터베이스의 article 테이블에 매핑한다.
 * 
 * @author Jacob
 */
public class Post {
	// 글번호
	String postId;

	// 제목
	String userId;

	// 내용
	String name;

	// 작성자 아이디
	String content;

	// 좋아요 누른 횟수
	String sweet;

	// 등록일시
	String cdate;

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", userId=" + userId + ", name=" + name + ", content=" + content + ", sweet="
				+ sweet + ", cdate=" + cdate + ", getPostId()=" + getPostId() + ", getUserId()=" + getUserId()
				+ ", getName()=" + getName() + ", getContent()=" + getContent() + ", getSweet()=" + getSweet()
				+ ", getCdate()=" + getCdate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}