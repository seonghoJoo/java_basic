package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Ex5 {
	public static void main(String[] args) {
	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pwd = "1111";
		
		String sql = "INSERT INTO groups(group_id, name, debut_date) VALUES(5,'시스타','2016-06-03')";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("1) 드라이버 구동");
			con = DriverManager.getConnection(url, user, pwd);
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println(result+ "개 입력");
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(stmt!=null) {
					stmt.close();
				}//if end
			}catch(Exception e) {
			}
			try {
				if(con!=null) {
					con.close();	
				}//if end
			}catch (Exception e) {
			}//try~catch end
		
		}
	
	}//main() end
}// Ex5 end
