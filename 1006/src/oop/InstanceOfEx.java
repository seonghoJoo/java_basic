package oop;

public class InstanceOfEx {
	public static void main(String[] args) {
		Object o = new C();
		// 변수 instanceof 클래스
		// instanceof 쓸때: 안전하게 형변환 하기 위해 예외처리에 사용 
		// 해당 instance에 변수(객체)가 포함되어 있냐?
		System.out.println(o instanceof Object);
		System.out.println(o instanceof String);
		System.out.println(o instanceof B);
		System.out.println(o instanceof C);
		System.out.println(o instanceof E);

		for(int i=1; i<10 ; i++ ) {
			System.out.println("★");
			// o와 연결된 instance 내부에 String 이 없음
			
			// 예외처리
			if(o instanceof String) {
				String s = (String) o;
				System.out.println(s.substring(1));
			}//if end
			
		}//for end
	}//main() end
}// InstanceOfEx end
