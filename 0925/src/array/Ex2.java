package array;

public class Ex2 {

	public static void main(String[] args) {
		String a = "A";
		String b = new String("A");
		String[] s = new String[4];
		String c;
		//System.out.println(c);
		s[0] = a;
		b = s[1];
		s[2] = "A";
		System.out.println(s[3]);
		System.out.println(s[0]==s[1]);
		System.out.println(s[1]==s[2]);
		System.out.println(a==b);
		System.out.println(b);
	}

}
