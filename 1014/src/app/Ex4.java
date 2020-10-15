package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Book;

public class Ex4 {
	public static void main(String[] args) {
		SqlSession session = SqlSessionUtil.getSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 책번호?");
		int no = Integer.parseInt(sc.nextLine());
		// nextInt는 enter값을 먹지 않는다.
		
		System.out.println("수정할 이름?");
		String title = sc.nextLine();
		
		Book book = new Book(no,title);
		int result = session.update("books.update",book);
		System.out.println(result+ "개 업데이트 완료했습니다");
		
	}// main() end
}// Ex4 end
