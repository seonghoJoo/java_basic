package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex3 {

	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionUtil.getSession();
//		Group group = new Group();
//		group.setName("소녀시대");
//		Date debutDate = Date.valueOf("2007-8-5");
//		group.setDebutDate(debutDate);
//		
//		int result = sqlSession.insert("groups.insert",group);
//		System.out.println(result+ "개 입력");
//		
//		Group group2 = new Group("트와이스",Date.valueOf("2015-07-07"));
//		int result2 = sqlSession.insert("groups.insert",group2);
//		System.out.println(result+ "개 입력");
	
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 그룹명은??");
		String name = scan.nextLine();
		System.out.println("데뷔일은?");
		System.out.println("예) 2020-10-14 형식을 지켜줘요");
		String debutDateStr = scan.nextLine();
		Group group = new Group(name,Date.valueOf(debutDateStr));
		int result = sqlSession.insert("groups.insert",group);
		System.out.println(result+ " 그룹이 등록됬습니다.");
	}

}
