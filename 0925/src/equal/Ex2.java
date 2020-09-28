package equal;

public class Ex2 {

	public static void main(String[] args) {
		
		// string은 객체자료형이지만 기본 자료형 처럼 쓰인다라는 어처구니 없는 말을 한다(망언)
		// 결국 오버라이딩 때문에 값비교가 됨
		// 명시적 객체생성
		String s1= new String("Test");
		// 명시적 객체생성
		String s2= new String("Test");
		
		// 암시적 객체생성 문자열이라고 얘기하면 안됨
		String s3 = "Test";
		// 암시적 객체생성 앞으로 문자열 이라고 얘기하면 안됨
		String s4 = "Test";
		// 암시적 객체생성 문자열 아니야
		String s5 = "test";
		
		// 암시적 객체생성에 대해서는 상수풀 (constant pool)이라고 둠
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}
}
