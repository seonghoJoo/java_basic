package wrapper;

/*
	2020-10-05 11:57 주성호
	wrapper 생성자 
*/

public class Ex1 {

	public static void main(String[] args) {
		
		/*
				Wrapper 클래스들
				1) 기본자료형 -> 객체자료형으로 사용하려고 만든 애들 (컬렉션때문에)
				배열은 고정배열이라 우린 동적배열인 컬렉션을 씀
				 
				2) 기본자료형에 대한 메서드, 상수를 가지고 있음 
				Boolean
				Character
				Byte
				Short
				Integer
				Long
				Float
				Double
				
				- 생성자
				생성자(해당기초자료형)
				생성자(String형)
				Integer(1);
				Integer("1");
				Boolean("TRuE");
				Integer("AAA"); // NumberFormatException이 발생
				
				단 Character 만 String형으로 생성자 만들 수 없음 
				오직 char 형만 넣을 수 있음
		 */
		Integer i = new Integer(2323);
		Integer i2 = new Integer("2323");
		System.out.println(i==2323);
		System.out.println(i);
		System.out.println(i==i2);
		
		Long l = new Long(4);
		Long l2 = new Long("234");
		
		Character c = new Character('ㅁ');
		
		
		/*
		 		대소문자 상관없이 TRUE 만 있으면 true
		 		나머지는 전부 false
		 * */
		Boolean b = new Boolean(false);//false
		Boolean b2 = new Boolean(""); // false
		Boolean b3 = new Boolean("TrUe");// true
	}//main() end

}//Ex1 end
