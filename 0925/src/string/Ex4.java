package string;

public class Ex4 {
	public static void main(String[] args) {
		/*
		  		String 객체는 불변함
				java 5 버전 이상에서는 컴파일러가 컴파일 시 StringBuilder로 바꿔준다.
				
				실무적으로 봤을때 차이가 없어서 그냥 써도 된다.
				StringBuffer 1.0
				StringBuilder는 자바5 (1.5)에 추가됨 : 속도가 빠름
				
				StringBuffer는 쓰레드에 안전하기 때문에 속도가 느림
				
				쓰레드 stack 이 여러개~
				
				StringBuffer와 StringBuilder의 차이는
				멀티쓰레드 환경에서는 StringBuffer를 사용하고
				싱글쓰레드에서는 StringBuilder를 사용
				
				그래서 StringBuffer, StringBuilder를 사용함
				
				toString() 모든 객체가 다 갖고 있다.
		 */
		StringBuilder sb = new StringBuilder("A"); 
		sb.append("B");
		sb.append("C");
		sb.append("D");
		
		String s = sb.toString();
		System.out.println(s);
		
//		String s = "A";
//		s+="B";
//		s+="C";
//		s+="D";
//		System.out.println(s);
	}		
}
