package oop;

public class A {
	// 접근 제한자가 default이고
	// 기본자료형이 int형인 인스턴스 멤버필드 a
	// 값에 접근하려면 new A().a = or A a = new A(); a.a로 접근 
	int a;
	
	// 접근 제한자가 default이고
	// 기본자료형이 int형인 static 멤버필드 b
	// 값에 접근하려면 A.b = 
	static int c;
	void test() {
		a = 10;
		c = 20;
		System.out.println(a);
		System.out.println(c);
	}
	
}
