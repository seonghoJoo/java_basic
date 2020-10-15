package com.bmj.ims.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Group;

public class GroupsDAO {
	public static int waste=0;
	public static List<Group> selectList(){
		List<Group> groups = null;
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			groups = session.selectList("groups.selectList");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}//try~catch~finally end
		return groups;
	}//selectList() end
	
	public static int insertGroup(Group group) {
		SqlSession session = null;
		int result = 0;
		
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("groups.insert",group);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// return 이후에도 작동이 된다.
			
			if(session != null) {
				session.close();
			}
		}
		return result;
	}
	
	public static int deleteGroup(int groupId) {
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			return session.delete("groups.delete",groupId);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}//try~catch~finally end
		return 0;
	}
}//GroupsDAO end
