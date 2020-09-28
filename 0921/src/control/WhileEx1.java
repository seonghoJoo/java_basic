package control;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		분기문은 if문 switch문이 있음
		 * 		모든 switch문은 if문이 변경이 가능하나, 모든 if문은 switch문으로 변경이 불가능함
		 *		반복문은 for, while문이 있음
		 *		완벽하게 호환이 가능함
		 *
		 *		- for :  반복횟수를 알고있을때
		 *		- while : 반복횟수를 모를때 
		 *		그래도 상호호환이 가능해서 쓸 수 있음
		 *		while 문 문법
		 *		while(조건식){
		 *			반복구문
		 *		}
		 *		while문은 문법이 쉽지만 주의할점이 있다.
		 */		
		
		
		// 2 4 6 8 10 출력
		for(int i=2;i<11;i+=2) {
			System.out.print(i + " ");
		}// for end
		System.out.println();
		int k=2;
		while(k<11) {
			System.out.print(k + " ");
			//조건식은 있지만 증감식이 있어야한다.
			k+=2;
			
		}// while end
		
	}//main() end

}//WhileEx1 end
