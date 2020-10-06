package animalhospital;

public class Chicken extends Animal{
	
	// 상속받은 추상메서드는 무적권 구현해야함
	@Override
	public void cry() {
		System.out.println("꼬끼오!");
	}
	
}
