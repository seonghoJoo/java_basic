import java.util.Scanner;

public class ScEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요!");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		//for(초기식 ; 조건식 ; 증감식){}
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * "+ i + " = " + dan*i);
		}
	}

}
