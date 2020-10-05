package wrapper;


public class Ex2 {

	public static void main(String[] args) {
		// int형의 최댓값
		System.out.println(Integer.MAX_VALUE);
		
		// long형의 최댓값
		System.out.println(Long.MAX_VALUE);
		
		
		// String을 int 형으로 변환하는 메서드 parseInt
		String s = "123";
		// parseInt => public static int parseInt(String s)
		int n = Integer.parseInt(s);
		System.out.println(n+2);
		int i = Integer.valueOf(s);
		
		// valueOf
	}

}
