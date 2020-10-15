package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;


public class Ex3 {
	public static void main(String[] args) throws Exception {
		
		
		Connection conn = ConnectionUtil.getConnection();
		//3) 구문 객체 생성
		Statement stmt = conn.createStatement();
		//4) sql 쿼리 생성
		String sql = "SELECT idol_id-1, name, height, weight, birth_date, gender, group_id " + 
				"FROM idols ORDER BY 1";
		//5) 쿼리 실행
		ResultSet rs = stmt.executeQuery(sql);
		
		//6) 결과 출력
		while(rs.next()) {
			int idolId = rs.getInt(1);
			String name = rs.getString(2);
			double height = rs.getDouble(3);
			double weight = rs.getDouble(4);
			Date birthDate = rs.getDate(5);
			char gender = rs.getString(6).charAt(0);
			int groupId = rs.getInt(7);
			System.out.println(idolId +") " + name+ " / " + height +"cm / " +weight + "kg / "+birthDate + " / " + (gender=='M'?"남자":"여자")+ " / " + groupId);
		}
		
		
	}//main() end
}// Ex3 end
