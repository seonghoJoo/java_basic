package operator;

public class OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		비트연산자
		 		- |
		 		- &
		 		- ~
		 		
		 		비트연산자와 논리연산자의 차이는 
		 		비트연산은 피연산자 1,2 모두 실행됨
		 		
		 		논리연산은 논리(true or false)가 중요하기 때문에
		 		피연산자 1이 true이거나 false일때 피연산자 2가 수행되지 않음 (데드코드)
		 		
		 */
		byte a = 1;
		byte b = 2;
		
		int c = ~a+1;	//보수처리
		System.out.println(c);
		
		System.out.println(true | true);
		System.out.println(true || true);	//데드코드
		
	}

}
