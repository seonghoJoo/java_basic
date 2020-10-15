package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.GroupsDAO;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 그룹번호?");
		
		int groupId = sc.nextInt();
		int result = GroupsDAO.deleteGroup(groupId);
		
		System.out.println(result+ "개 삭제 완료");
		
	}//main()end
}//Ex5 end
