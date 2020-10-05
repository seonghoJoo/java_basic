package token;

import java.util.*;
public class Ex2 {

	public static void main(String[] args) {

		/*
		 		StringTokenizer가 가진 주요 메서드
		 		- hasMoreTokens() : 남아있는 토큰의 유무 확인(true, false)
		 		- nextToken() : 현재 토큰을 반환하면서 커서가 이동
		 **/
		
		StringTokenizer stok = new StringTokenizer("테넷,,,위플래시,라라랜드,인셉션," , ",");
		while(stok.hasMoreTokens()) {
			String movie = stok.nextToken();
			System.out.println(movie + " " + stok.nextToken());
		}//while end
	}// main() end

}//Ex2 end
