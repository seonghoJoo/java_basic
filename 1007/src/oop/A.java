package oop;

public interface A {
	
	// static final 생략가능
	// 상수가 뭐냐? final => static화 시키는게 효율적
	static final int A = 10;

	//abstract 생략가능
	void test();
	/*
	  		인터페이스는 클래스와 클래스간의 접점
	  		
	  		-	인터페이스는 클래스가 아님
	  			(생성자 X, 객체 생성 안됨)
	  		
	  		-	인터페이스는 상수, 추상메서드만 가짐
	  		
	  		-	인터페이스는 상수만 가질 수 있기 때문에 static final을 생략가능(자바 비밀)	
	
	  		- 	인터페이스는 추상메서드만 가질 수 있기 때문에 abstract를 생략가능
	  		
	  		-	자바는 다중 상속이 불가능하나 다중 구현은 가능
	 */
	
}
