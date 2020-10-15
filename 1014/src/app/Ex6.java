package app;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex6 {
	
	public static void main(String[] args) {
		
		SqlSession session = SqlSessionUtil.getSession();
		
		List<Group> groups = new ArrayList<>();
	    groups = session.selectList("groups.selectList");
		for (Group group : groups
				) {
			System.out.println(group.toString());
		}
		
	}// main() end
}//Ex6 end
