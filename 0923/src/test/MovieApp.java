package test;

import vo.Movie;

public class MovieApp {

	public static void main(String[] args) {
		
		Movie m1 = new Movie();
	
		m1.setTitle("테넷");
		m1.setDirector("크리스토퍼 놀란");
		m1.setAudienceNum(1500000);
		
		String title = m1.getTitle();
		System.out.println("영화 이름은 " + title);
		String director = m1.getDirector();
		System.out.println("감독 이름은 " + director);
		int audienceNum = m1.getAudienceNum();
		System.out.println("관객 동원수는 " + audienceNum);
		
		
	}//main() end

}//MovieApp end
