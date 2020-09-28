package secret;

/*
 		마치의 영어의 불규칙 동사같은 넘들
 		
 	 	자바의 숨겨진 비밀 1번째
 		java.lang 패키지 안에 있는 클래스들은 빈번하게 사용되기 때문에
 		항상 import 하면 귀찮아서 편리함을 위해서 생략가능
		import java.lang.*;
 */
import java.lang.*;
import java.lang.System;
class A{
	static int a;
	int b;
	void test() {
		b =10;
		System.out.println(b);
	}
}

public class Ex1 {
	static int a;
	public static void main(String[] args) {
		/*
		 		자바의 숨겨진 비밀 2번째
		  		같은 클래스 내부에서 
		  		static 멤버들끼리 접근할 때
		  		클래스명. 을 생략할 수 있음
		 */
		int a;
		Ex1.a = 5;
		a=10;
		System.out.println(a);
		A ac = new A();
		//ac.test();
	}//main() end
	/*
	 		개발자들이 편리하게 하기 위하여
	 		기본 개념에서 생략되는 것들이 상당히 많이 존재합니다.
	 		
	 		이를 '자바의 숨겨진 비밀' 이라고 칭함
	 		
	 		
	 * */
}
