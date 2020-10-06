package animalhospital;

public class AnimalHospitalApp {

	public static void main(String[] args) {

		// 추상화의 정수
		Animal[] rooms = new Animal[5];
		// Object 안쓰는 이유 우리가 만든애들 안나와
		
		rooms[0] = new Dog();
		rooms[1] = new Cat();
		rooms[2] = new Snake();
		rooms[3] = new Crocodile();
		rooms[4] = new Fox();
		// 개삽질
		for(int i=0;i<rooms.length;i++) {
			if(rooms[i] instanceof Dog) {
				Dog d = (Dog)rooms[i];
				d.cry();
			}else if(rooms[i] instanceof Cat) {
				Cat c = (Cat)rooms[i];
				c.cry();
			}else if(rooms[i] instanceof Snake) {
				Snake s = (Snake)rooms[i];
				s.cry();
			}else if(rooms[i] instanceof Crocodile) {
				Crocodile croc = (Crocodile)rooms[i];
				croc.cry();
			}else if(rooms[i] instanceof Fox) {
				Fox f = (Fox)rooms[i];
				f.cry();
			}// if~else end
		}// for end
		
		for(Animal ani : rooms) {
			ani.cry();
		}
		
	}//main() end
	

}//AnimalHospitalApp end
