package daum;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ReviewCrawlingApp {
	
	// JSON
	public static void main(String[] args) throws Exception{
		
		// 서버 연결
		URL url = new URL("https://comment.daum.net/apis/v1/posts/149655001/comments?parentId=0&offset=0&limit=10&sort=RECOMMEND&isInitial=true&hasNext=true");
		
		// 스트림 연결
		InputStream in = url.openStream();
		
		// FileInputStream fis
		
		// FileOutputStream fous
		
		// 서버 주소에서 불러 오겠다는 뜻
		// 스트림을 스캐너로
		Scanner scan = new Scanner(in);
		
		//문자열 얻어옴
		String html = scan.nextLine();
		System.out.println(html);
		
		// json이지만 문자열을 Java 객체로
		// json의 배열 -> List 혹은 배열로
		// json의 객체 -> 자바의 객체로

		// jackson json 라이브러리가 필요함
		
		
		
	}//main() end
}//ReviewCrawlingApp end
