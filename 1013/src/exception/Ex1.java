package exception;

import java.util.Random;

public class Ex1 {
	
	public static void main(String[] args) {
		/*
		  		우리가 지금까지 봤던 예외들
		 		throws 했다고 예외처리 되는것이 아님
		 		
		 		예외처리 목적 : 비정상 종료를 막고 끝까지 작동시켜야하는것임
		 */
		
		// 1) NullPointerException
//		String str= null;
//		System.out.println(str.substring(1));
		
		// 2) ArrayIndexOutOfBoundException
//		int[] iArr = new int[4];
//		System.out.println(iArr[4]);
		
		// 3) StringIndexOutOfBoundException
//		String str1 = "123";
//		System.out.println(str.substring(5));
		
		// 4) NumberFormatException
//		int i = Integer.parseInt("AAA");
		
		// 5) ClassNotFoundException
		//Class.forName("sdfsdfsdf");

		// 6) ClassCastException
//		Object obj = new String("test");
//		Ex1 e = (Ex1)obj;
		// 객체 생성을 아끼자!
		Random ran = new Random();
		for(int i=0;i<=100;i++) {
			// ArithmaticException
			int num = ran.nextInt(5/0);
			System.out.println(num);
		}// for end
		
	}//main() end
	
	
} // Ex1 end
