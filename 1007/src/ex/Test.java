package ex;

public class Test {
	int num;
	void test(int a) {
		System.out.println("인트");
	}
	void test(Object o) {
		System.out.println("오브젝");
	}
	void test(Test t) {
		System.out.println("테스트");
	}
	Test(int num){
		this.num = num;
	}
	Test(){}
	
	@Override
	public String toString() {
		return "숫자 "+ this.num + " : " + (this.num %2==0 ? "짝" : "홀")+"수입니다.";
	}
	
	public static void main(String[] args) {
		Object o = new Test(3);
		Test t = new Test(10);
		
		System.out.println(o);
		System.out.println(t);
		System.out.println(new Test(7));
	}//main() end
	

}//Test end
