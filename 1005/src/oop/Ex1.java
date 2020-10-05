package oop;

public class Ex1 extends Object{
	
	int a = 10;
	public Ex1() {
		super();
	}
	
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		System.out.println(e.a);
		
		// 다형성 자료형이 여러개가 됨
		Object obj = new Ex1();
		System.out.println(obj.toString());
	
	
	}//main () end
}// Ex1 end
