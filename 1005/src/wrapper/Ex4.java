package wrapper;

public class Ex4 {

	public static void main(String[] args) {

		/*
		  		자바 5에 추가된 개념
		  		오토박싱 언박싱
		  		why? 빈번하게 사용되고 편리하게 사용하기 위해서 새로 추가함
		
				true, false 값
				
				boolean byte short int long만
				-128 ~ 127까지 객체를 생성해 놓은 후 상수풀에 추가시킴
				
				
		 */
		// 암시적 객체생성
		Integer i = 3; // 오토박스 기본자료형 -> 객체자료형
		Integer i2 = 3;
		System.out.println(i == i2); // true 왜냐하면 암시적 객체 생성으로 레퍼런스가 같음
		
		// 명시적 객체생성
		Integer i3 = new Integer(3);
		Integer i4 = new Integer(3);
		System.out.println(i3 == i4); // false 왜냐하면 명시적 객체 생성으로 레퍼런스가 다름
		
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);// false 암시적 객체생성은 -128~127까지만 허용
		
		Double d = 3.14;
		Double d2 = 3.14;
		System.out.println(d == d2); // false
		
		
		
	}//main() end

}//Ex4 end
