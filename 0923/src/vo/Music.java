package vo;

public class Music {
	
	private String title; // 곡제목
	private int playTime; // 시간(초)
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public String getTitle() {
		return title;
	}
	public int getPlayTime() {
		return playTime;
	}
	
	/*
	  		VO 규칙
	  		1) 멤버필드들을 private으로 선언
	  		2) 멤버필드 당 하나씩 getter setter 선언
	  		3) 기본생성자를 무조건 만들어야한다. 
	 */
	
}
