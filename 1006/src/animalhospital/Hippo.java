package animalhospital;

public class Hippo extends Animal{
	
	// 상속받은 추상클래스 animal이 가진 
	// 추상 메서드 cry를 구현(오버라이딩, 메서드 재정의)
	// 하지 않아서 맨처음에 에러가 발생함
	
	@Override
	public void cry() {
		System.out.println("흐아아악!");
	}
}
