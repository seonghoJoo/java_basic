package string;

import java.util.Scanner;
import java.lang.*;

public class Ex3 {

	public static void main(String[] args) {

		System.out.println("당신의 이멜 입력~");
		
		// 입력받음 
		// kimpilgu@gmail.com
		// blazebottle@naver.com
		Scanner sc = new Scanner(System.in);
		
		// 이메일중 아이디만 추출하여 출력
		String email = sc.nextLine();
		
		// 방법 1
		String []s = email.split("@");
		System.out.println("당신의 아이디는 "+s[0] + "입니다.");
		
		
		// 방법 2
		int index=email.indexOf('@');
		System.out.println("당신의 아이디는 " + email.substring(0,index) + "입니다.");
		
	}

}
