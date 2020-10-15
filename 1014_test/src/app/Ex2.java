package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름? ");
		String name = sc.nextLine();
		System.out.println("키? ");
		double height = Double.parseDouble(sc.nextLine());
		System.out.println("몸무게? ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.println("생년월일? ");
		System.out.println("예)2001-12-21");
		Date birthDate = Date.valueOf(sc.nextLine());
		System.out.println("성별? ");
		System.out.println("예)남자면 M / 여자면 F? ");
		char gender = sc.nextLine().charAt(0);
		System.out.println(""+gender);
		System.out.println("그룹번호? ");
		System.out.println("1) 레드벨벳 "+"2) 나인뮤지스 "+ "3) 동방신기 " + "4) 룰라 " + "5) 소녀시대 " + "7) 트와이스" + "8) 서태지와아이들 ");
		int groupId = Integer.parseInt(sc.nextLine());
		Idol idol = new Idol(0,groupId,name,height,weight,birthDate,gender);
		SqlSession session = SqlSessionUtil.getSession();
		int result = session.insert("idols.insert",idol);
		System.out.println(result+"명이 등록되었습니다.");
		System.out.println(name);
		System.out.println(weight);
		System.out.println(height);
		System.out.println(""+gender);
		System.out.println(birthDate);
		System.out.println(groupId);
	}
}
