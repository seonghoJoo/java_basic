package token;

import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		/*
		 *		문자열을 쪼갤때 
		 *
		 *		방법
		 *		1) String이 가진 split 메서드
		 *		2) StringToknizer 클래스 사용
		 */
		
		String movies = "테넷|인사이드아웃|인셉션|라라랜드";
		String[] movieArr = movies.split("\\|");
		for(String s : movieArr) {
			System.out.println(s);
		}
	}

}
