package control;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("☆★☆★ 학점 계산기 ver0.99☆★☆★");
		System.out.println("당신의 점수를 입력하세요.(0~100)");
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		char c='F';	//else를 없애주는 센스
		if(grade>90) {
			c=65; // c='A'
		}else if(grade>80) {
			c=66;
		}else if(grade>70) {
			c=67;
		}else if(grade>60) {
			c=68;
		}
		System.out.println(c+"학점");
	}

}
