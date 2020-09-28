package wrapper;

public class Ex4 {

	public static void main(String[] args) {

		/*
		  	equals 가 값비교
		  	== 레퍼런스 비교
		 */
		
		Integer i = new Integer(3);
		Integer i2 = 3;	//오토박싱 = 암시적 객체 생성
		int a = 3;
		Integer i3 = a; // 오토박싱
		Integer i4 = 3; // 오토박싱
		int b = i4;     // 언박싱
		
		System.out.println(i==i2);
		System.out.println(i==i3);
		System.out.println(i==i4);
		System.out.println(i2==i3);
		System.out.println(i3==i4);
		System.out.println(i2==i4);
	}
}
