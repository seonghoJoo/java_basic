package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 아이돌 번호");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("수정할 아이돌 이름 입력");
		String name = sc.nextLine();
		
		Idol idol = new Idol(no,name);
		System.out.println(idol.getIdolId() + idol.getName());
		int result = IdolsDAO.UpdateById(idol);
		System.out.println(result+"명의 아이돌 이름이 변경됨");
	}//main() end
}//Ex6 end
