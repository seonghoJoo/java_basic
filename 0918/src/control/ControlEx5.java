package control;

import java.util.Scanner;

public class ControlEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("단을 입력(2~9까지)");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
	}//main() end

} //ControlsEx5 end
