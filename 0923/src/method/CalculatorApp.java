package method;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int num1 = 8;
		int num2 = 5;
//		int result = calc.add(4,5);		//  heap
//		result = Calculator.add(2, 3); 	//	static
		// System은 클래스 out은 static 변수이다.
		System.out.println(Calculator.add(num1, num2));
		System.out.println(Calculator.subtract(num1, num2));
		System.out.println(Calculator.multiply(num1, num2));
		System.out.println(Calculator.divide(num1, num2));
	}//main() end

}//CalculatorApp end
