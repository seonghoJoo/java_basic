package exception;

public class Ex3 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);// <- 얘에서 멈춤
			System.out.println(4);
		}catch(Exception e) {
			//예외가 발생했을때만 작동
			System.out.println(5);
		}
		System.out.println(6);
		
	}//main() end
}//Ex3 end
