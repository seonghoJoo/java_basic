import java.util.Scanner;

public class ScEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요!");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		System.out.println((score<90?"불" : "")+"합격");
	}

}
