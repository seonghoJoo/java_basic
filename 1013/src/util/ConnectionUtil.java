package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	//중복된 코드는 메서드로 빼라
	public static Connection getConnection() throws Exception{
		return getConnection("test");
	}
	public static Connection getConnection(String user) throws Exception{
		Connection con=null ;
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩완료!");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String password = "1111";
		con = DriverManager.getConnection(url, user, password);
		
		return con;
	}
	
}
