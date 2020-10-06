package oop;

class A{
	int c=1;
}
class B extends A{
	int b= 4;
}
class C extends  B{
	int a = 7;
}

public class Ex2 extends B{
	int d = 4;
	public static void main(String[] args) {
		Object o = new C();
		Ex2 e = new Ex2();
		A a =(A)o;
		//B b = e;
		C c = (C)a;
		o = "test";
		System.out.println(o.toString());
	}

}
