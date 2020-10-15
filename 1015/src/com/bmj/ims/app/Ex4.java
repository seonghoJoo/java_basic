package com.bmj.ims.app;

import java.sql.Date;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.vo.Group;

public class Ex4 {
	public static void main(String[] args) {
		int a = func();
		System.out.println(a);
	}
	public static int func() {
		int a=0;
		
		try {
			System.out.println("try");
			return a;
		}catch(Exception e) {
			
		}finally {
			System.out.println("finally");
			System.out.println("finally");
			System.out.println("finally");
			System.out.println("finally");
			System.out.println("finally");
		}		
		return a;
	}


}

