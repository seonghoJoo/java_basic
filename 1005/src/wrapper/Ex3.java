package wrapper;

public class Ex3 {

	public static void main(String[] args) {

		/*
		  		Wrapper는 String과 비슷함
		  		== : 레퍼런스 비교
		  		equals : 값 비교 단 자료형이 다르면 안됨(같은 클래스일 경우만)
		  		
		  		
		  		
		 */
		Integer i = new Integer(3);
		Integer i2 = new Integer("3");
		Long l = new Long(3);
		
		System.out.println(i);
		System.out.println(i2);

		// 레퍼런스 비교
		System.out.println(i==i2);
		
		// 값비교
		System.out.println(i.equals(i2));
		
		//다른 자료형??
		//System.out.println(i==l);	// 오류 : 다른 자료형
		System.out.println(i.equals(l));	//false : 다른 자료형
		
		
	}//main() end

}//Ex3 end
