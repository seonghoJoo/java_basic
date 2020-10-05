package string;

import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringTokenizer / String.split()
		
		// StringTokenizer(String str) str을 기본 구분문자인 
		// white space, tab, new line등의 구분문 자로하여 분할할	
		// StringTokenizer	객체를	생성함
		// StringTokenizer(String str, String	delim)
		// str을 두 번째 인자인 delim으로 구분지어 분할할 StringTokenizer 객체를 생성함
		// StringTokenizer(String str, String delim, boolean returnDelims)
		// str을 두번째 인자인 delim으로 구분지어 분할할 StringTokenizer
		// 객체를 생성할 때 delim 역시 token 자원으로 사용할 것인지를 returnDelims로 결정함
		
		String	str	=	"학교,집,,게임방";// ,, 쓰레기 값이 하나 있음.
		StringTokenizer	tokens	=	new	StringTokenizer(str,	",");
		for	(int x = 1; tokens.hasMoreTokens(); x++) {
			System.out.print("문자"	+ x + " = " + tokens.nextToken()+"\t");
		}
		System.out.println("");
		System.out.println("=============================");
		String[] values = str.split(",");
		for(int x = 0; x < values.length;x++)	{
			System.out.print("문자"	+ (x + 1) + " = " +values[x]+"\t");
		}
		System.out.println("");

		// int countTokens() token된 자원의	수를 반환함
		// boolean hasMoreTokens() token할 수 있는 자원이 있을 경우 true, 없으면 false를 반환함
		// String nextToken() token된 자원을 반환함
		
	}

}
