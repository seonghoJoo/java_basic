package practice;

public class A {
	private int a;
	public int test(int b) {
		a = 10;
		return b =10;
	
	}
	private static int test() {
		// 자바 3번 비밀 같은 클래스 내에서 인스턴스 멤버 메서드 내에서 인스턴스 멤버 필드 접근시 this. 생략가능
		// 자바 2번비밀 같은 클래스 내에서 static 멤버 메서드 내에서 static 멤버 필드 접근시 클래스명. 생략가능
		
		int b = new A().test(20);
		//a = b;
		return b;
	}
	public static void main(String[] args) {
		
	}
}
