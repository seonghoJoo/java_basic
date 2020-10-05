package array;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] movies= {
				"테넷","엑스맨" , "반지의 제왕","인터스텔라","겨울왕국2"};
		/*
		  		자바5 (1.5)에서 추가된 향상된 for 문
		  		for(자료형 :배열 혹은 컬렉션){
		  		}
		 */
		// 향상된 for each 문
		for(String movie : movies) {
			System.out.println(movie);
		}// for end
		for(int i=0;i<movies.length;i++ ) {
			System.out.println(movies[i]);
		}
		
	}//main() end

}//Ex5 end
