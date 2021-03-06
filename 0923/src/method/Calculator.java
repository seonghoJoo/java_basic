package method;

public class Calculator {
	
	/*
	 	멤버필드의 선언은 
	 	접근제한자 (static) 자료형 이름;
	 */
	/*
	 	(멤버) 메서드의 선언
	 	접근제한자 (static) 리턴자료형 메서드명 (인자...){
	 		구문...
	 	}
	 */
	
	// 더하는 메서드
	public static int add(int num1 , int num2) {
		return num1+num2;
	}
	
	// 빼는 메서드
	public static int subtract(int num1 , int num2) {
		return num1-num2;
	}
	
	// 곱하는 메서드
	public static int multiply(int num1 , int num2) {
		return num1*num2;
	}
	
	// 나누는 메서드
	public static double divide(int num1 , int num2) {
		return (double)num1/num2;
	}
	
}
