package vo;

public class Actor {
	private String name;
	private int height,weight;
	public Actor() {
	}
	public Actor(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/* toString을 메서드재정의(overriding) */
	
	@Override
	public String toString() {
		
		String s = null;
		s = "이름 : " + this.getName() + " / 키 : " + height + " / 몸무게 : "+ weight;
		
		// this.이 생략되어있음 name weight height를 써도 됨
		return s;
	}
	/*
	  		메서드 선언 초급방법
	  		첫번째 줄에 리턴자료형과 동일한 지역변수를 선언 후 초기화함
	  		
	  		마지막줄에 리턴키워드 지역변수 선언
	 */
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(this==obj) return true;
		if(obj instanceof Actor) {
			Actor tmp = (Actor) obj;
			if(tmp.getName().equals(name) && tmp.getHeight() == height && tmp.weight == weight) {
				return true;
			}
		}
		return flag;
	}
	
}
