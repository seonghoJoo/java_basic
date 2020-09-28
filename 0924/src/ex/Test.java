package ex;
// 명심할 말
// 프로와 아마의 차이
// 어떠한 경우에라도 일정한 퍼포먼스를 내야한다
// 실수도 곧 실력이라 나중에 실력이 반복되면 나중에 나에게 일을 주지 않는다.


class A{
	int a;	//접: default
	int test(int a,int b) {	//접: default 리턴: int 인자: int a int b / 인스턴스 메서드 test 
		return a+b;
	}
}
public class Test {
	// 실행하면 main 메서드 실행
	// 서버개발하면 main 안씀 지금은 자바를 배우니깐 main을 쓰는거임
	public static void main(String[] args) {
		// 다른 클래스 내부 -> 생략불가
		// 인스턴스 멤버들이 메모리에 나타날 조건 -> 객체를 생성하는것
		A b = new A();
		int a = b.test(6, 5); // a = 11;
		
		a = b.test(b.a, a); // 0 + 11;
		System.out.println(a);
		
	}
	
}
