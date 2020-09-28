package access;

import test.B;

public class Ex1 {
	
	/*
	 		접근제한자(access modifier)
	 		
	 		-   public : 어디서든 접근 가능
	 			
	 			
	 		-   protected : 같은 패키지와 상속관계일때만 접근 가능
	 		
	 		
	 		-   (defualt) : 같은 패키지 내부에서만 
	 		
	 		
	 		-   private : 같은 클래스 내부에서만 접근가능 은닉화 캡슐화를 위해서 사용
	 * */
	
	
	public static void main(String[] args) {
		
		/*
		 		A클래스를 가지고 만들어진
		 		객체의 레퍼런스를 담을 수 있는
		 		지역변수 a를 선언
				A a;
				하고 new 라는 키워드로 heap 메모리 영역에
				공간을 할당받고 A클래스의 생성자를 호출하여
				객체를 생성한 후
				new A(); 
				그 객체의 레퍼런스를 a에 대입
				A a = new A();
		 */
		A a = new A();
		// 		private 으로 선언된 a멤버 필드에는 접근불가
		a.b = 10;
		a.c = a;
		a.d = "크크";
		
		B b = new B();
		// B 와 Ex1 은 다른패키지에 있기때문에
		// (상속관계도 아님)
		// 접근제한자가 public인 d만 접근가능
		b.d = a.d;
	
	}//main() end
}//Ex1 end
