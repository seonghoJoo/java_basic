package app;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class Ex7 {
	public static void main(String[] args) {
		
		List<Idol> idols = new ArrayList<>();
		SqlSession session = SqlSessionUtil.getSession();
		idols = session.selectList("idols.selectList");
		for (Idol idol : idols) {
			System.out.println(idol);
		}
	}// main() end
}//Ex7 end
