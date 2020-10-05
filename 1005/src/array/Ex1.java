package array;

public class Ex1 {

	/*
	  		2020-10-05 11:03 주성호
	  		자바 for문 탐색 
	 */
	public static void main(String[] args) {
		
		/*
		 		자바의 배열은 크기 고정에
		 		메서드도 없음
		 		(그래서 컬렉션 클래스들을 활용)
		  		
		  		배열과 for문간의 연관관계가 높음
		  		
		 */
		
		int[] iArr = new int[4];
		
		iArr[0] = 3;
		iArr[1] = 5;
		iArr[2] = 7;
		iArr[3] = 9;
		
		for(int i=0;i<iArr.length;i++) {
			System.out.print(iArr[i] + " ");
		}//for i end
		System.out.println();
		int[] iArr2 = {3,5,7,9};
		
		/*
		  		향상된 for문(for each문)
		  		for(자료형 변수 : 배열 혹은 컬렉션) {
		  		}
		 */
		for(int i : iArr2) {
			System.out.print(i + " ");
		}// for end
		
	}//main() end

}// Ex1 end
