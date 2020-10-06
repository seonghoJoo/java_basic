package oop;

// overriding : 우선시 하다
// 메소드 재정의
// 상속관계에서 최하위에 있ㄴ는 메소드가 호출이 됨
class B{
	int a = 5;
	void test() {
		System.out.println("B.test()");
	}
}
class C extends B{
	int a = 10;
	void test() {
		System.out.println("C.test()");
	}
}

public class OverridingEx1 {
	public static void main(String[] args) {
		
		/*
		 
		 		오버라이딩이란?
		 		-	메서드 재정의
		 		-	상속관계에서 부모에서 물려받은 메서드를 
		 			새로운 기능으로 재정의함
		 		- 	조상의 메서드를 호출해도 최하위 자손의 메서드가 실행됨
		 		
		 		-   추상화 한 애는 메소드 명이 존재해야하고 실제론 구현에선 자손애만 작동하면 됨
		 		equals()
		 */
		
		Object o = new C();
	
		B b = (B)o;
		C c = (C)b;
		
		String s = "TEST";
		System.out.println(o);
		System.out.println(c.a);	//10
		System.out.println(b.a);	//5
		
		c.test();		//C.test() 출력
		b.test();		//C.test() 출력
		
		
	}
}
