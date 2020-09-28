package scanner;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 3개 입력!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a+"*"+ b+ "*" + c +"="+(a*b*c));
	}

}
