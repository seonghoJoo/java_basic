package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex7 {
	public static void main(String[] args) {

		// 아이돌 출력 번호: 이름:
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT idol_id, name FROM idols";
		try {
			con = ConnectionUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("번호: " + rs.getInt(1) + " 이름: " + rs.getString(2));
			} // while end
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				} // if end
			} catch (Exception e) {

			} // try catch end
			try {
				if (stmt != null) {
					stmt.close();
				} // if end
			} catch (Exception e) {

			} // try catch end
			try {
				if (con != null) {
					con.close();
				} // if end
			} catch (Exception e) {

			} // try catch end

		} // try catch finally end

	}// main() end
}// Ex7
