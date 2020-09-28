package array;

public class Ex2 {
	public static void main(String[] args) {
		// java는 배열형은 자료형이기 때문에 
		// String[] arr int[] arr로 "[]" 가 식별자 바로 뒤에 와야한다.
		String[] sArr = new String[3];
		
		// null pointer exception이 발생함
		System.out.println(sArr[0].substring(0,1));
		
		
		
	}//main() end

}// Ex2 end
