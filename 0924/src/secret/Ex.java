package secret;

import java.util.Scanner;
/* 
  		1) java.lang 패키지에 있는 클래스들은
  		빈번하게 사용되기 때문에 import 생략가능
 */
public class Ex {
	static int a;
	
	int b;
	
	void test() {
		// this. 생략 가능 
		this.b = 10;
		/*
	  		3)  같은 클래스 내부에서
	  			인스턴스 멤버들끼리 접근시
	  			this. 생략가능
	  			this.b = 10; or b = 10; 같음
		 */
	}
	/*
	  		4) 개발자가 단 한개라도 생성자를 선언하지 않으면
	  		   컴파일러가 컴파일 시 기본생성자를 하나 만들어 줍니다
	  	
	  		   하지만, 개발자가 단 한개라도 생성자를 선언하면
	  		   컴파일러는 컴파일시 안만들어줍니다.
	 */
	public Ex(int a) {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// static 안은 this란 개념이 없음
		// 메모리에 a가 없기 때문에 a=10 할 수 없음.
		Ex e = new Ex(2);
		e.a = 10;
		e.test();
		/*
		  		2) 같은 클래스 내부에서 static 멤버들끼리 접근할 때
		  		   클래스명. 생략할 수 있음.
				   Ex.a = 5; or a = 5;
		 */
		
		System.out.println(e.b);
	}
}
