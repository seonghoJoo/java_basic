package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisApp1 {
	public static void main(String[] args) throws Exception{
		
		Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
	
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//sqlSession <--- 이놈 회사가서도 얘가 중요함
		SqlSession session = factory.openSession(true);
		
		int result = session.delete("groups.delete");
		
		System.out.println(result+"개 성공");
	}//main() end

}// MyBatisApp1 end
