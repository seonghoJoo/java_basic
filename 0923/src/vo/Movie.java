package vo;

/*
 			VO란?
			- value object의 줄임말
 			- 데이터를 저장하는 객체
 			- DTO 라고도 함 (Data Transfer Object)
 			- VO 생성규칙
 			1) 멤버필드를 private 으로 선언
 			2) 멤버필드의 접근을
 			getter, setter으로 접근
 */
public class Movie {
	// 접근제한자가 private이고
	// 객체자료형이 String형인
	// instance 멤버필드 title
	private String title; 		// 영화제목
	
	// 접근제한자가 private이고
	// 객체자료형이 String형인
	// instance 멤버필드 director
	private String director; 	// 감독명
	
	
	private int audienceNum; 	// 관객수
	
	
	/*
	 		은닉화는 멤버필드들을 많이 하는거 같음
  			은닉화란 멤버를 private으로 선언하여
  			외부에서 직접 접근하지 못하게 막는 방법
  			(은행의 금고를 생각하면 됨)
  			
  			why? : 외부에서 직접 접근할 경우 잘못된 값이
  			들어갈 수 있고 적적하지 않게 사용될 수 있어서
  			
  			
  			캡슐화는 멤버 메서드를 많이 하는거 같음
  			캡슐화란 
  			
  			외부에 알릴 필요가 없는 기능 및 속성을 숨기는 것 
	 */
	
	// title의 setter
	public void setTitle(String title){
		// 객체의 레퍼런스 . 
		this.title = title;
	}
	// director의 setter
	public void setDirector(String director){
		// 객체의 레퍼런스 . 
		this.director = director;
	}
	// audienceNum의 setter
	public void setAudienceNum(int audienceNum){
		// 객체의 레퍼런스 . 
		this.audienceNum = audienceNum;
	}
	
	// title의 getter
	public String getTitle() {
		return this.title;		// this 생략가능
	}
	// director의 getter
	/*	
	 *  자바의 비밀 3
	 *  this.director 에서 this 생략가능
	 * 
	 */
	public String getDirector() {
		return this.director;	// this 생략가능	
	}
	// audienceNum의 getter
	public int getAudienceNum() {
		return this.audienceNum;
	}
	
	
}
