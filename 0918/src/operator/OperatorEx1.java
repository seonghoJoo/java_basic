package operator;

public class OperatorEx1 {
	
	public static void main(String[] args) {
		/*
		  		산술연산자(숫자끼리)
		  		1) + : 덧셈연산 
		  			   문자열 합침 연산(산술연산 x)
		  			   
		  			   피연산자 중에 하나라도 문자열이 있다면
		  			   나머지 하나도 문자열로 변경하여 문자열끼리 합침
		  			   // 자바스크립트 규칙과 동일함
		  			   
		  		2) - : 뺄셈
		 		3) * : 곱셈
		 		4) / : 나눗셈연산(몫??)
		 		5) % : 나머지 연산
		 */
		// 클래스는 객체자료형이다
		int a = 4;
		int b = 5;
		int result = a+b;
		System.out.println("4+5=" +result);
		//같은 지역내에 a라는 변수를 두번 선언할수는 없습니다.
		//int a;
		result = a-b;
		System.out.println("4-5=" +result);
		
		result = a*b;
		System.out.println("4*5=" +result);
		
		result = a/b;
		System.out.println("int 4/5=" +result);
		double result1 = (double)a/b;
		System.out.println("double 4/5=" +result1);
		
	}
	
}//OperatorEx1 class 종료
