package wrapper;

public class Ex5 {

	public static void main(String[] args) {
		
		/*
		  		오토박싱이 암시적 객체생성이 되는 경우
		  		
		  		Boolean
		  		Character '0 ~ 127'
		  		Byte
		  		Short, Integer, Long : -128 ~ 127
		  		
		  		그 외엔 명시적 객체생성
		 */
		Character c = 'z';
		Long l = 100L; //오토박싱에서는 자동형변환이 안됨
		long l1 = 100;
		
	}

}
