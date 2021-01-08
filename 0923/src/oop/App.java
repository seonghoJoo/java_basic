package oop;

public class App {

	int a;// 접근제한자 : default / 기본자료형 int / 인스턴스 멤버 a
	static int b;// 접근제한자 : default / 기본자료형 int / static 멤버 b
	static void test() {
		
		new App().a = 20;// 인스턴스
		// 언제 어디서나 쓸수 있는것이 static
		b = 10; // static
		main();
	}
	public static void main() {// 멤버 메서드
		test();
	}
	public static void main(String[] args) {

		/*
		 		자바 프로그램이 실행되면
		 		우선 static으로 선언된
		 		멤버들(필드, 메서드)이 먼저
		 		static 메모리영역에 로딩됨
		 		
		 		그리고 main메서드를 JVM이 호출하여 프로그램이 시작됨
		
		 		그러니깐 static으로 선언된 멤버들은
		 		객체를 생성하지 않고 바로 사용가능(대입 및 호출)
		 */
		/*
		  		자바의 숨겨진 비밀
		  		멤버에 접근할때는 instance 객체의 레퍼런스로 
		 */
		//App.a = 10;
		
		A.c = 10;
		
	}

}
