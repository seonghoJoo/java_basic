package exception;

import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		
		/*
		  		try{
		  			예외가 발생할 가능성이 있는 구문
		  			try 안에 들어가면 속도가 느려짐
		  		}catch(Exception e){
		  			예외가 발생했을 때 수행할 구문
		  		}finally{
		  			
		  		}
		 */
		Random ran = new Random();
		for (int i = 0; i < 100; i++) {
			int num = ran.nextInt(5);
			try {
				System.out.println(i+") " + 5/num);
			}catch(Exception e) {
				System.out.println(i+"번에서 0번");
			}//try~catch end
		}
		
	}//main() end
}// Ex2 end
