package access;

public class A {
	
	// 같은 클래스 내부이기 때문에
	// a,b,c,d 전부 접근가능
	void test() {
		// this -> 자기자신의 레퍼런스
		// this가 생략되어있음.
		this.a = 10;
		b = 10;
		c = new A();
		d = "zz";
	}
	
	// 접근제한자가 private이고
	// 기본자료형 int 형인
	// 인스턴스 멤버필드 a
	private int a;
	
	
	// 접근제한자가 default이고
	// 기본자료형 int 형인
	// 인스턴스 멤버필드 b
	int b;
	
	// 접근제한자가 protected이고
	// 객체자료형 클래스 A형인
	// 인스턴스 멤버필드 c
	protected A c;
	
	
	// 접근제한자가 public 이고
	// 객체자료형 String 형인
	// 인스턴스 멤버필드 d
	public String d;
}
