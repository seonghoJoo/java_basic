package test;

public class TestApp {

	public static void main(String[] args) {

		Object t = new Test(3);
		Object t2 = new Test(3);
		
		System.out.println(t.equals(t2));
		
	}

}
