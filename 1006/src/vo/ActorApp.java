package vo;

public class ActorApp {

	public static void main(String[] args) {

		Object o1 = new Actor("마동석",178,100);
		System.out.println(o1.toString());
	
		Object o2 = new Actor("마동석",178,100);
		System.out.println(o2.toString());
		
		/*
		  			Object가 가진 equals() 메서드를 호출하기 때문에
		  			당연히 == 비교 레퍼런스 비교이기 때문에 false인데
		  			우리가 equals() 메서드를 overriding하여 이름, 키, 몸무게가
		  			같을경우 true가 되도록 해보자!
		 */
		System.out.println(o1.equals(o2));
	
		Actor actor1 = new Actor("마동석",178,100);
		Actor actor2 = new Actor("마동석",178,100);
		System.out.println(actor1.equals(actor2));
	}//main() end

}//ActorApp end
