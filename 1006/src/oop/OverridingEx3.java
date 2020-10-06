package oop;

public class OverridingEx3 {
	public static void main(String[] args) {
		
		
		Object o = new Object();
		String s = new String("TEST");
		System.out.println(o);
		System.out.println(o.toString());
		
		//오버라이딩의 기적
		o = new String("TEST");
		s = new String("TEST");
		System.out.println(o==s);
		System.out.println(o.equals(s));
		System.out.println(o);
		System.out.println(o.toString());
	}
}
