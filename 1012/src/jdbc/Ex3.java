package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은?");
		String deleteName = sc.nextLine();
		
		// 1) 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩 성공");
		
		// 1.5) 커넥션 데이터
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pwd = "1111";
		// 2) 커넥션 객체 얻기
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		// 3) 구문 객체 생성
		Statement stmt = con.createStatement();
		// 4) SQL 작성
		String sql = "DELETE FROM idols WHERE idol_id=(SELECT idol_id FROM idols WHERE name='"+deleteName+"')";
	
		// 5) 결과 실행 후 출력
		
		int result = stmt.executeUpdate(sql);
		System.out.println(deleteName+"이/가 삭제되었습니다.");
		
	}

}
