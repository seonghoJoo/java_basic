package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex6 {
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT group_id, name, debut_date FROM groups ORDER BY 1";
		try {
			con = ConnectionUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1) +") " + rs.getString(2) + " / " + rs.getDate(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				
			}//try~catch end
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}catch(Exception e) {
				
			}// try~ catch end
			try {
				if(con!=null) {
					con.close();
				}
			}catch(Exception e) {
				
			}//try~catch end
		}//try~catch~finally
		
	}// main() end
	
}// Ex6 end
