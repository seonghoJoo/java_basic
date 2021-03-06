package vo;

/*
  		vo 생성규칙
  		1. 멤버 필드들의 접근제한자를 private 으로 선언
 		2. 멤버 필드들 접근시 getter setter로 접근
 		3. 기본 생성자 꼭 만들어주기
 */
public class Member {
	
	private String name;	//이름
	private String code;	//학번
	private char gender; 	// 성별(M,F)
	private String major;	// 전공
	
	// 생성자란 멤버필드 초기화 할 때 쓴다
	public Member() {
	}
	// 속도냐 크기냐?
	// 생성자간 호출 과 메서드간 호출은 엄청 빨라서 크기 1byte라도 줄이는게 맞다.
	public Member(String name) {
		this(name,'M'); // 객체는 this라서 안만들어짐
	}
	public Member(String name, char gender) {
		this(name,"20학번",gender);// 객체는 this라서 안만들어짐
	}
	public Member(String name, String code, char gender) {
		// super은 상속때 배우며 생략가능
		this(name,code,gender,"컴퓨터공학과"); // 객체는 this라서 안만들어짐
	}
	// 현업에서 생성자로 아예 초기화 하는 방법
	// 생성자 오버로딩
	public Member(String name, String code, char gender, String major) {
		this.name = name;
		this.code = code;
		this.gender = gender;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
