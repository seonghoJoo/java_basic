package string;

public class Ex1 {
	public static void main(String[] args) {
		
		/*
		 		String 의 메서드들은
		 		절대 원본 문자열을 훼손하지 않음
		 		
		 		리턴받아서 사용
		 		
		 		
		  		String의 주요 메서드
		  		-  charAt(인덱스) : 해당 인덱스의 문자(char 형) 하나를 리턴하는 메서드
		  		-  concat(문자열)
				-  contains("문자열") : true or false
				-  indexOf() : 
				-  isEmpty() : 비었냐?
				-  lastIndexOf() : 
				-  length() : 길이
				-  subString() : 
		 */
		String s = "ABCDEFGHIJ";
		
		char c = s.charAt(2);
		System.out.println("c : "+c);
		
		//s += "CD";
		String temp = s.concat("CD");
		System.out.println("temp : "+temp);
		System.out.println("s : " + s);
		
		System.out.println(s.contains("BCD"));	//true false
		
		/*
		  		- indexOf(문자 혹은 문자열) charAt의 반대 return int index 시작점 반환
		 		해당 문자의 시작된 인덱스를 반환 단, 없으면 -1을 반환
		 		
		 		- lastIndexOf(문자 혹은 문자열) : 뒤에서 부터 만나는 첫번째 문자의 index 값 리턴 없으면 -1을 반환  
		 */
		String str = "가나다라마바";
		int indexChar = str.indexOf('가');  // 0
		int indexStr = str.indexOf("다라"); // 2
		int wrongStr = str.indexOf("필구"); // -1
		System.out.println("indexChar : " + indexChar + " indexStr : " + indexStr + " wrongStr : " + wrongStr);
		
		str = "Hello Java";
		
		System.out.println("indexOf : "+ str.indexOf('l'));
		System.out.println("lastIndexOf : " + str.lastIndexOf('l'));
		
		System.out.println("strLength : " + str.length());
		/*
		  		-  subString(시작 인덱스) : 시작 인덱스 부터 끝까지의 문자열을 리턴
		  		-  subString(시작, 끝) : 시작 인덱스 ~ 끝-1 인덱스까지 
		 */
		str = "가나다라마바";
		
		String subS = str.substring(3); // 3부터~ 끝까지
		System.out.println("subS : " + subS);
		
		subS = str.substring(2,str.length());
		System.out.println("subS : " + subS);
		
		
	}//main() end
}//Ex1 end
