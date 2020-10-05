package token;

import java.util.StringTokenizer;

public class Ex3 {

	public static void main(String[] args) {

		StringTokenizer stok = new StringTokenizer("1,2,3,4,5,010-1234-2371",",-");
		while(stok.hasMoreTokens()) {
			System.out.println(stok.nextToken());
		}//while end
		
	}//main() end

}//Ex3 end
