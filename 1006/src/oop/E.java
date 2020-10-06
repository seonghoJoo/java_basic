package oop;

class A{
	int a = 1;
	int b = 10;
}

public class E extends A{
	
	int a = 10;
	
	public static void main(String[] args) {
		
		Object e = new E();/// object <- A <- E가 차례로 만들어짐
		A a = (A) e;

		E o = (E) e;
		System.out.println(a.a);
		
		System.out.println(o.a);
	
		
		
	}//main() end
}//E end
