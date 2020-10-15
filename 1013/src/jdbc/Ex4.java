package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex4 {
	public static void main(String[] args) throws Exception {
		System.out.println("100) Steven King / 부서명 : Executive");
		
		Connection conn = ConnectionUtil.getConnection("hr");
		Statement stmt = conn.createStatement();
		String sql = "SELECT employee_id, first_name, last_name, department_name "
				+ "FROM employees e, departments d "
				+ "WHERE e.department_id = d.department_id" ;
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			String departmentName = rs.getString(4);
			System.out.println(id + ") " + firstName+" " + lastName + " / 부서명 : " + departmentName);
		}//while end
	}//main() end
}//Ex4 end
