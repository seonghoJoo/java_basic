package wrapper;

public class Ex5 {
	public static void main(String[] args) {
		/*
		  		오토박싱 : 기본 -> 객체
		  		언박싱 : 객체 -> 기본
		  		
		  		//정수형 4개만 -128~127만 constant pool을 봄
		  		 
		 */
		
		int i = 10;
		Integer i2 = i;	//	오토박싱
		i = i2;			//  언박싱
		
		System.out.println(i == i2);
		
	}// main() end
	

}//Ex5 end
