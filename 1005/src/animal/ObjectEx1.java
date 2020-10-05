package animal;

public class ObjectEx1 {

	public static void main(String[] args) {

		/*
		  		모~든 클래스의 조상 : Object 
		 		(단군할아버지같은 존재)
		 */
		
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj == obj2);
		System.out.println(obj.equals(obj2));
		System.out.println(obj.toString());
		
		Integer i = new Integer(10);
		System.out.println(i.toString());
		/*
		  		주요메서드
		  		
		  		-	equals(객체레퍼런스) : 
		  			거의 대부분의 클래스들은 레퍼런스 비교 
		  			String, Wrapper은 값비교
		  		
		  		-	toString() :
		  			객체를 String으로 거의 모든 클래스들은
		  			패키지.클래스@해쉬코드 16진수
					String, Wrapper은 자신의 값 출력
				
				
		 */
	}//main() end

}// ObjectEx1 end
