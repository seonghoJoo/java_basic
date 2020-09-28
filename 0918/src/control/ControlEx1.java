package control;

import java.util.Scanner;

public class ControlEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 나이는?");
		
		// 만약 나이가 20살 이상이면
		// 당신은 성인입니다. 출력
		// 20살 미만이면
		// 당신은 성인이 아닙니다 출력
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
//		String msg="이 아닙";
//		if(age >=20) {
//			msg="입";
//		}// if~else
//		
		//극한의 효율충
		System.out.println("당신은 성인"+
				(age>=20 ? "입" :"이 아닙")
				+"니다");
		
	}// main end
}// ControlEx1 end
