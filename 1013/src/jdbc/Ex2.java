package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;


public class Ex2 {
	public static void main(String[] args) throws Exception{
		
		
		Connection con = ConnectionUtil.getConnection();
		
		//3) 구문 객체
		Statement stmt = con.createStatement();
		
		//4) SQL 구문 작성
		String sql = "SELECT group_id, name, debut_date FROM groups";
		
		//5) 수행 후 결과 집행 얻기
		ResultSet rs = stmt.executeQuery(sql);
		
		// 결과 출력
		while(rs.next()) {
			int groupId = rs.getInt(1);
			String name = rs.getString(2);
			Date debutDate = rs.getDate(3);
			
			System.out.println(groupId + ") " + name + " / 데뷔일 " + debutDate);
		}//while end
		
	}// main() end
}//Ex2 end
