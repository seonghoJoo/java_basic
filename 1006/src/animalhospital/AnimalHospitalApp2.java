package animalhospital;

public class AnimalHospitalApp2 {

	public static void main(String[] args) {
		
		// Animal이라는 추상적인 개념은 객체로 만들지 말아야한다.
		Animal animal = new Dog();
		// Animal은 울면 안된다.
		animal.cry();
		animal.eat();
		
		Animal tiger = new Tiger();
		tiger.cry();
		
		
		
	}//main() end

}//AnimalHospitalApp2 end
