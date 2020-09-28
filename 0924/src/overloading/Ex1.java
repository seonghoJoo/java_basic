package overloading;

public class Ex1 {
	
	/*
	 * 	실행 안됨
	 *  static private int test(){
	 *  	return 1;
	 *  }
	 */
	
	// 개수가 다름 파라미터 0개
	static void test() {
		System.out.println("A");
	}
	// 개수가 다름 파라미터 1개
	static void test(int a) {
		System.out.println("B");		
	}
	// 인자가 다름 파라미터 1개
	static void test(boolean a) {
		System.out.println("C");		
	}
	static void test(int a, boolean b) {
		System.out.println("D");
	}
	static void test(boolean a, int b) {
		System.out.println("E");
	}
	
	
	public static void main(String[] args) {

		//명확함
		test();
		test(1);
		test(true);
		test(1,true);
		test(true,1);
		
		/*
		  		오버로딩이란?
		  		-  이름이 같고 인자가 다른 것
		  		-  ex) System.out.println();
		  		-  인자가 다르다는 것은
		  		1)  자료형이 다름
		  		2)  개수가 다름
		  		3)  순서가 다름
		  				
		 */
	}//main() end
	
}// Ex1 










