package com.bmj.ims.app;

import java.sql.Date;
import java.util.Scanner;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.vo.Group;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 그룹명? ");
		String name = sc.nextLine();
		
		System.out.println("데뷔일? ");
		System.out.println("형식)YYYY-MM-DD");
		Date date = Date.valueOf(sc.nextLine());
		
		Group group = new Group(name,date);
		int result= GroupsDAO.insertGroup(group);
		
		System.out.println(result+"개의 그룹이 잘 등록되었습니다.");
	}// main() end
} // Ex3 end
