package exception;

public class Ex7 {
	// RuntimeException을 하면 예외처리를 안해도 되지만
	// 그외는 무적권 예외처리를 해야함 ex) ClassNotFoundException
	static void test() throws ClassNotFoundException {
		System.out.println("test 함수 완료");
	}
	public static void main(String[] args) {
		try {
			test();
			Integer.parseInt("123");
		}catch(Exception e) {
			
		}
	}//main() end
}// Ex7 end
