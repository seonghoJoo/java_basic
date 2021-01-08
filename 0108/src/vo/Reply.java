package vo;

public class Reply {
	
	private String comment, nickname;
	private int no; 
	
	public Reply() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "no:"+no+" / nickname : " + 
				nickname + " / comment : " 
				+ comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
