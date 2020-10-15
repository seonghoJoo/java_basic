package exception;

public class Ex6 {
	public static void main(String[] args){
		
		/*
				RuntimeException을 상속받는 Exception들은 예외처리 할 필요가 없습니다.
				반대로 나머지 모든 Exception들은 반드시 예외처리를 해줘야 합니다.
				
				RuntimeException들은 덜 위험하다.
		 */
		
		throw new NumberFormatException();	//강제로 예외를 발생시킴
		
	}//main() end
}// Ex6 end
