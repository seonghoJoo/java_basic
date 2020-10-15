package org.bmj.hr.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Employee;

public class EmployeesDAO {

	/*
	  		DAO(Data Access Object)
	  		-  데이터베이스와 연동하여 CRUD만 담당하는 전용 객체 무적권 테이블 당 하나
	 		
	 		코드 리팩토링
	 		작동은 똑같으나 코드 더 이쁘게 하자~
	 */
	public static List<Employee> selectList(){
		List<Employee> employees = null;
		
		SqlSession session=null;
		try {
			session =  SqlSessionUtil.getSession();
			employees = session.selectList("employees.selectList");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}// try ~ catch ~ finally
		return employees;
	}// selectList() end
	
	public static List<Employee> selectSearchName(String q){
		List<Employee> employees = null;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			employees = session.selectList("employees.selectSearchName", "%"+q.toLowerCase()+"%");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}//try ~ catch ~ finally
		
		return employees;
	}//selectSearchName(q) end
	
}
