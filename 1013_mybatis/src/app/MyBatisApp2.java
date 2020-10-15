package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisApp2 {
public static void main(String[] args) throws Exception{
		// 프레임워크
		// 객체 생성주기 관리 / 
		// sql 맵핑 객체 프레임워크 ORM DataBase와 연동한 프레임워크임
		// VO 와 sql을 맵핑한다. 시퀀스 <- 오라클
		
		// 3d 모델링  / 맵핑  / 라이팅 / 애니메이팅 4가지로 구성
		// 모델링 .(점)을 땡기고 해서 3d 모양을 만듦 
		// 맵핑 소스 2d -> 3d로 바꿈
		
		/*
		  		1) 프로젝트 생성
		  		2) configuration build path에 ojdbc.jar, mybatis.jar add
		  		3) config(setting), app(main method), mapper(sql 구문), 
		  		vo(객체와 sql 구문 mapping), dao(data access object db와 연동만 함),
		  		util(중복된 명령어 함수화)
		  		4) mybatis-config.xml 복사 최대한 재사용하자
		  		5) 해당 테이블 이름으로 mapper 파일을 생성(사실상 복사 네임스페이스 변경)
		  		6) 
		 */
		
	
		Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
	
		SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//SqlSession <--- 이놈 회사가서도 얘가 중요함
		SqlSession session = factory.openSession(true);
		
		int result = session.delete("idols.delete");
		
		System.out.println(result+"개 성공");
	}//main() end

}
