package test;

public class Test {
	
	private int a;
	
	public Test(int a) {
		this.a = a;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean flag = false;
		if(obj == this) return true;
		if(obj instanceof Test) {
			Test tmp = (Test) obj;
			return tmp.a == a;
		}
		return flag;
	}
	
}
