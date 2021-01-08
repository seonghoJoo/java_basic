package app;

interface A {
	
}
//class B implements A {
//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		
//	}
//}

public class Ex2 {
	
	private static void test(A a) {
		System.out.println("크크");
	}
	
	public static void main(String[] args) {
		
		/*
		 * A 인터페이스를 구현한 익명의
		 * 클래스를 선언하고 생성하는 코드
		 */
		test(new A(){});
		
	}//main() end

}//Ex2 end




