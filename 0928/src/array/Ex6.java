package array;

public class Ex6 {

	public static void main(String[] args) {

		Integer[] iArr = new Integer[4];
		iArr[0] = 3;
		iArr[2] = 5;
		// 3 null 5 null
		// 5 null 3 null
		for(Integer i : iArr) {
			System.out.println(i);
		}
		
	}

}
