package control;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		break 구문만나면 반복문을 멈춤
		 * */
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<1000;i++) {
			System.out.println("비밀번호 입력하세요");
			int pwd = sc.nextInt();
			
			if(pwd == 1234) {
				System.out.println("환영~");
				break;
			}
		}//for end
	}//main() end
	
}//WhileEx3 end
