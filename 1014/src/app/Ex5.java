package app;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex5 {
	public static void main(String[] args) {
		/*
		  		SqlSession의 주요메서드
		  		- insert 
		  		- update 
		  		- delete 
		  		- selectList 
		  		- selectOne 
		 */
		SqlSession session = SqlSessionUtil.getSession();
		
		Group group = session.selectOne("groups.selectOne");
		
		System.out.println(group.getGroupId()+") "+group.getName()+" / " + group.getDebutDate());
	}//main() end
	
	
}//Ex5 end
