package constructor;

public class Ex1 {
	
	// Ex1 의 기본생성자가 없지만 있다.
	// 개발자가 선언하지 않을 시 컴파일 된 .class 파일에는 있다.
	// 생성자의 리턴값은 무조오오오오건 레.퍼.런.스
	public Ex1() {
		System.out.println("생성자");
	}
	private Ex1(boolean a) {
	}	
	public void Ex1() {
		System.out.println("메서드");
	}
	
	/*
	  		생성자의 선언
	  		생성자는 static 있지도 않음
	  		
	  		접근제한자 클래스명(인자){}
	  		
	 */
	
	
	public static void main(String[] args) {
		// 생성자 메서드라는 말을 쓰면 손절!
		// Ex1 클래스의 기본생성자 호출
		Ex1 e = new Ex1();
		
	}// main() end
}//Ex1 end