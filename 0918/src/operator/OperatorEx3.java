package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 		++ / 00
		 		1항 연산자
		 		증감 연산자
		 		피연산자 앞 선위
		 		피연산자 뒤 후위
		 		대입 연산자(=, +=...) 우선순위보다 후위연산자의 우선순위가 낮다
		 */
		int i=3;
		++i;	// 선위 증가 연산자 (4)
		i++;	// 후위 증가 연산자 (5)
		--i;	// 선위 감소 연산자 (4)
		
		int a = 4;
		int b = ++a;
		// a : 5
		// b : 5
		
		int c = 4;
		int d = c++;
		// c : 5
		// d : 4
		
		System.out.println(a++);
		
	
	}

}
