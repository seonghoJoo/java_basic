package operator;

public class OperatorEx2 {
	
	public static void main(String[] args) {
		
		/*
		  	byte < short < int < long < float < double
			
		 	int 이하의 자료형은 산술연산시 결과값이 무조건 int
		 	byte + byte : int
		 	byte + short : int
		 	byte+ + int : int
		 	
		 	int 초과의 자료형은 둘중에 큰 자료형으로
		 	int + long : long
		 	long + long : long
		 	int + float : float
		 	long + float : float
		 	float + double : double
		 	int / int : int!!
		 */
		
		// 기본자료형 byte형인 지역변수 a를 선언하고
		// 숫자 1로 초기화(대입)
		byte a = 1;
		
		// 기본자료형 byte형인 지역변수 b를 선언하고
		// 숫자 2로 초기화(대입)
		byte b = 2;
		
		// 
		float c = a+b;
		System.out.println(c);
		
		
		int c1 = 5;
		int d1 = 2;
		double result2 = (double)(c1/d1); 	//2.0
		double result3 = (double)c1/d1; 	//2.5
	}//main() end
	
}// OperatorEx2 class end
