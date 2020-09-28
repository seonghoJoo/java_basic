package scanner;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		클래스는 객체자료형이다(외워야)
		 * 		클래스 ? 객체 ?
		 * 		
		 *		자바 개발자들이 만들어 놓은
		 *		수많은 클래스들이 있습니다
		 *		그 클래스 안에는 수많은 메서드가 존재합니다
		 *		
		 *		그래서 위의 클래스나 메서드들을 엮어놓은것을 API라고 합니다.
		 *  	(JDK 안에 존재함)
		 * */
		
		/*
		 		같은 패키지 안에 있는 클래스들은 그냥 사용이 가능한데
		 		다른 패키지 안에 있는 클래스들은 반드시 import 해야함
		 		같은 패키지 안에 Scaner라는 클래스가 없음.
		 */
		
		// 기초자료형
		int i;
		// 객체자료형(Reference Type) Scanner 클래스형 
		// 지역변수 scan 선언
		
		/*
		 		Scanner 클래스를 가지고 만들어진
		 		객체의 레퍼런스를 담을수 있는 지역변수 scan을 선언
		 * */
		Scanner scan;
		
		/*
		 		생성자를 호출 -> 객체가 만들어짐
		 		리턴자료형이 객체의 레퍼런스
		 		
		 		Scanner 생성자를 호출하여 객체를 생성후
		 		scan 변수에 대입
		 */
		scan = new Scanner(System.in);
		/*
		 		new 라는 키워드로 heap 메모리 영역에 공간을 할당받고
		 		Scanner 클래스의 생성자를 호출하여
		 		Scanner 객체를 생성후 그 레퍼런스를 scan 변수에 대입
		 		리턴값이 레퍼런스 = (메모리 상에 존재하는 주소값)
		 */
		System.out.println("당신의 이름은?");
		// Scanner 클래스가 가진 메서드중에
		// -  nextLine() : 유저에게 문자열 한줄
		// -  nextInt() : 정수형 한개 입력받는 메서드
		String name = scan.nextLine();
		System.out.println("당신의 이름은 " + name+ "입니다.");
		
		System.out.println("당신의 나이는?");
		int age = scan.nextInt();
		
		System.out.println("당신의 몸무게는?");
		Double weight = scan.nextDouble();
		
		
		
	}//main() end

}//ScannerEx1 end
