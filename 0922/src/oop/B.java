package oop;
// 1 java 1 class 원칙에 어긋남 따라하지 마라
class A{
	A a;
	int b;
	static int c=3;
}//A end


public class B {
	public static void main(String[] args) {
		//다형성
		//Object a = new A();
		
		
		A a = new A();
		
		a.b = 3;
		a.a = new A();
		System.out.println(a.a.a);
		
	}//main() end
}//B end
