package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import util.ConnectionUtil;

public class Ex1 {
	
	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은? ");
		
		String name = sc.nextLine();
		
		
		Connection conn = ConnectionUtil.getConnection();
		
		//3) 구문객체 생성
		Statement stmt = conn.createStatement();
		
		//4) SQL 구문 작성
		String sql = "DELETE FROM idols WHERE name = '" + name + "'";
		
		//5) 결과 수행
	
		int result = stmt.executeUpdate(sql);
		System.out.println(result + "명 삭제");
		
		//	- insert / update / delete 결과가 int 몇개 바뀌었다. 
		// 	executeUpdate(sql 구문)
		// 	- select
		// 	executeQuery(sql 구문)
		
	}// main() end
}// Ex1 end
