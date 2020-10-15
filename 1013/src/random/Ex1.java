package random;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {

		//		자바스크립트처럼 Math클래스의
		//		random() 메서드를 활용할 수 있고
		//int ran = (int)Math.random()*6+1;
		
		//		Random이라는 클래스가 존재해서 
		//		Random 클래스를 활용할 수있음
		Random ran = new Random();
		// 0 ~ 5까지
		int num = ran.nextInt(6);
		
		for(int i=0;i<100;i++)
		{
			System.out.print(num + " ");
		}
	}//main() end

}//Ex1 end
