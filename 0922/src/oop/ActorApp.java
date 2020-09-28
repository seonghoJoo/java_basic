package oop;

public class ActorApp {
	// ActorApp의 멤버 필드
	int a;
	//main method가 있는 앤 객체를 만들지 않는다.
	public static void main(String[] args) {
		
		// Actor클래스의 생성자를 호출하여 객체를 생성
		// Actor 클래스는 객체자료형이고 설계도
		// 객체자료형 Actor 클래스형
		// a1라는 지역변수를 선언하고
		// Actor 객체를 생성한 뒤 
		// a1에 대입
		Actor a1 = new Actor();
		a1.name = "김슬기";
		a1.height = 157;
		a1.debut = "넌 내게 반했어";
		a1.gender='F';
		
		System.out.println("이름 : "+ a1.name);
		System.out.println("키 : "+ a1.height);
		System.out.println("성별 : "+ a1.gender);
		System.out.println("데뷔작 : "+ a1.debut);
		
		// Actor객체 하나 생성한것임
		// new Actor() 
		// a2
		Actor a2 = new Actor();
		a2.name = "최민식";
		a2.height = 177;
		a2.debut = "야먕의 세월";
		a2.gender='M';
		
		System.out.println("이름 : "+ a2.name);
		System.out.println("키 : "+ a2.height);
		System.out.println("성별 : "+ a2.gender);
		System.out.println("데뷔작 : "+ a2.debut);
		
		// a.3 변수 선언후 actor객체 새엉
		Actor a3 = new Actor();
		//이름
		a3.name="주성호";
		//키
		a3.height =180;
		//성별
		a3.gender ='M';
		//데뷔
		a3.debut="바ㅏㄻ";
		// 객체가 힙메모리에 만들어짐 레퍼런스(연결되어있는 선)이 있어야 접근 가능함
		// 여기는 스택 영역임
		// 나는 여기서 빔 프로젝털 쓸수 있지만 빔 프로젝터가 10m 높이 올라간다면?? 리모컨 없인 못킴
		// .(점) 레퍼런스 접근 연산자
	}//main() end

}//ActorApp class end
