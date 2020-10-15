package com.bmj.ims.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Idol;

public class IdolsDAO {
	public static List<Idol> selectList(){
		List<Idol> idols = null;
		SqlSession session = null;
		try {
			 session = SqlSessionUtil.getSession();
			 idols = session.selectList("idols.searchList");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}
		return idols;
	}
	
	public static int UpdateById(Idol idol) {
		SqlSession session = null;
		try {
			session = SqlSessionUtil.getSession();
			return session.update("idols.updateById",idol);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}
		}//try~catch~finally end
		return 0;
	}
}
