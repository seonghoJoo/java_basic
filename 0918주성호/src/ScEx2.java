import java.util.Scanner;

public class ScEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 2개를 입력하세요!");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//boolean result = num1 >num2;
		System.out.println(num1 +" "+ (num1>num2 ? ">" : "<")+" " + num2 + " = " + (num1>num2 ? true : false));
		//System.out.println(result);
		/*
		3>2 ==> true;
		3<4 ==> false;
		3+4 ==> 7;
		3-1 ==> 2;
		*/
	}

}
