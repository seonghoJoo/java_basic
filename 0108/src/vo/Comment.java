package vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({
	"id",
	"userId",
	"postId",
	"forumId",
	"parentId",
	"type",
	"status",
	"flags",
	"createdAt",
	"updatedAt",
	"childCount",
	"recommendCount",
	"screenedByKeeper",
	"user"
	})
public class Comment {
	
	private int likeCount,dislikeCount,rating;
	private String content;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(int dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
