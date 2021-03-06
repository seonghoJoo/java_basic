package wrapper;

public class Ex3 {

	public static void main(String[] args) {

		
		/*
				Wrapper들이 기본자료형을 객체 자료형으로 변경하는 것이므로
				편리함을 위해서 자바5(1.5)에서 오토박싱과 언박싱을 추가했는데
				"암시적 객체생성" 이라함
				
		 */
		
		
		
		// 대입연산자 사이에 좌 우의 자료형이 다름
		// 자바 5버전에 추가된 자바의 편리함
		
		// 오토박싱 객체로 감싸버려
		Integer i = 3;
		
		Integer i2 = 3;
		Integer i3 = new Integer(3);
		
		System.out.println(i == i2);
		System.out.println(i.equals(i2));
		
		System.out.println();
		
		System.out.println(i == i3);
		System.out.println(i.equals(i3));
	
		
		System.out.println();
		//  언박싱 
		//  (자동형변환 강제형변환이 아닌)
		int a = i; 
		System.out.println(i3 == a);
		System.out.println(i3.equals(a));
		
		System.out.println(i2 == a);
		System.out.println(i2.equals(a));
		
	}//main() end
	

}// Ex3 end
