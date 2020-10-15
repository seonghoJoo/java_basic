package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex2 {
	public static void main(String[] args) throws Exception {
		
		//1)드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩 완료");
		
		//1.5) 커넥션 데이터
		String url =  "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pwd = "1111";
		
		
		//2) 커넥션 객체 얻기
		Connection con = DriverManager.getConnection(url, user, pwd);
		System.out.println("2) 커넥션 객체 얻기");
		
		//3) 구문 객체 생성
		Statement stmt = con.createStatement();
		
		//4) SQL 작성
		String sql = "INSERT INTO idols(idol_id, name,height,weight,birth_date,gender,group_id)"
				+ "VALUES(8,'이상민',160.5,42.5,'1991-03-27','M',4)";
		
		//5) 결과 수행 후 출력 출력
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개 데이터 추가했습니다");
	}//main() end
}//Ex2 end
