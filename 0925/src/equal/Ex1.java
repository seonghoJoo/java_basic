package equal;
// 객체 항등이라는 것이 뭐냐?
class A{
	int a;
	public A(int a) {
		this.a = a;
	}// A(int a) end
}// A end


public class Ex1 {
	
	public static void main(String[] args) {
		// 객체의 항등이란 레퍼런스 비교 .(점 비교)
		A a = new A(1);
		A b = new A(1);
		// a == b false
		a = b; // a == b true
		
		b = null; // a == b false
		
		/*
		  	모든 객체에는 equals 메서드가 있음
		 */
		
	}// main() end
	
	
}// Ex1 end
