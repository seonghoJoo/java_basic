package constructor;

import vo.Member;

public class ClubApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		// 한 멤버에 대한 정보
		Member m1 = new Member();
		Member m2 = new Member("주성호","14학번",'M',"컴퓨터공학과");
				
		m1.setMajor("컴퓨터공학과");
		m1.setGender('M');
		m1.setName("주성호");
		m1.setCode("14학번");
	
		System.out.println(m1.getName());
		System.out.println(m1.getGender());
		System.out.println(m1.getMajor());
		System.out.println(m1.getCode());
		
		Member m3 = new Member("황정민","18학번",'F');
		Member m4 = new Member("황정민",'M');
		Member m5 = new Member("황정민");
		
	}//main() end

}//ClubApp end
