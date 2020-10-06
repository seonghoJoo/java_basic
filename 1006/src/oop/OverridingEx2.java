package oop;

public class OverridingEx2 {

	public static void main(String[] args) {

		// Object equals는 == 비교 레퍼런스 비교
		Object o = new String("Test");
		Object o2 = new String("Test");
		System.out.println(o.equals(o2));
		
		// String equals는 값비교로 overriding이 됨
		String s = new String("Test");
		String s2 = new String("Test");
		System.out.println(o.equals(o2));
		
	}//main() end

}// OverridingEx2
