package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은? ");
		String name = scan.nextLine();
		
		SqlSession session = SqlSessionUtil.getSession();
		
		
		int result = session.delete("idols.deleteByName",name);
		System.out.println(result+"명 삭제");
	}

}
