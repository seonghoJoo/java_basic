package animalhospital;

public abstract class Animal {
	
	String names;
	String species;
	int age;
	double weight;

	/*
	  		추상의 키워드 : abstract
	  		
	  		추상클래스
	  		-	선언:
	  			접근제한자 abstract class 클래스명
	  		-	일반클래스처럼 생성자도 가지고 일반메서드도 가질 수 있고, 멤버필드도 가질 수 있음
	  		-	단, new 생성자 호출로 객체생성 불가
	  		
	  		추상메서드
	  		
	  		-	본체(body)가 없는 메서드
			-	호출은 가능하지만 내용이 없음
	  		-	선언: 
	  			접근제한자 abstract (static) 리턴자료형 메서드명(인자)
	 */
	public void eat() {
		System.out.println("밥먹는중");
	}
	public abstract void cry();	
}//Animal end
