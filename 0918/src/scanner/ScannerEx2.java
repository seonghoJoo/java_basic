package scanner;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체자료형 Scanner 클래스를 지역변수에 sc로 선언했는데
		// 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 취미는? ");

		// enter 값 까지 값을 다 받아옴
		String hobby = sc.nextLine();
		
		System.out.println("당신의 취미는 " + hobby + "입니다.");
		
	}// main() end

}//ScannerEx2 end
