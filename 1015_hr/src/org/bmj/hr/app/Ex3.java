package org.bmj.hr.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.dao.DepartmentsDAO;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Department;
import org.bmj.hr.vo.Name;

public class Ex3 {
	public static void main(String[] args) {
		
		
		List<Department> departments = DepartmentsDAO.selectList();
		for (Department d : departments) {
			System.out.println(d);
		}
	}
}
