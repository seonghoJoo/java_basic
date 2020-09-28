package scanner;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개 입력: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.print(num1+"+"+num2+"=" + (num1+num2));
	}

}
