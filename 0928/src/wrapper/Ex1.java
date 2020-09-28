package wrapper;



public class Ex1 {

	public static void main(String[] args) {

		/*
		  		Wrapper 클래스들
		  		-  기본자료형을 객체자료형처럼 사용하기위해 필요한 클래스
		  		
		  		   Boolean Character Byte Short Integer Long Float Double
		  		   
		  		-  기본자료형에 필요한 메서드나 상수등을 가지고 있는 클래스
		  		
		  		-  자바 5(1.5 2003~2005년)에서 변경된 부분
		  		
		  		-  생성자(기본자료형 or String)
		 */
		Integer i = new Integer(3);
		
		//parseInt 해서 
		Integer i2 = new Integer("3");
		
		// A를 숫자로 형변환 할 수 없으니깐 
		// NumberFormatException 발생함
		//Integer i3 = new Integer("A"); 
		//System.out.println(i);	// 3
		//System.out.println(i2);	// 3
		
		// String -> int 형으로 변환하는 메서드
		// Integer.parseInt(문자열);
		// Integer 은 java.lang 패키지 안에 있기 때문에 생략가능
		// Integer 클래스 안에 있는 parseInt라는 멤버 메서드
		// 인자는 1개 리턴값은 int이다.
		int a = Integer.parseInt("12333");
		long max = Long.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(max);
		
		Double d = new Double("3.123456789");
		Float f = new Float("3.123456789f");
		System.out.println(d);
		System.out.println(f);
		
		// 약간 특이한 애들
		Boolean b = new Boolean(false);
		b = new Boolean(true);
		
		/*
		  		Boolean의 생성자의 인자 String은 대소문자 안가리고 T,R,U,E만 true고 나머진 전부 false
		 		(Exception이 발생하지 않음)
		 */
		b = new Boolean("TrUe");
		// equalsIgnoreCase("true") -> 대소문자 가리지 말고~ 받아주자 라고 명시됨
		System.out.println(b);
		
	}// main() end

}//Ex1 end
