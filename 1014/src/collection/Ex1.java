package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
	
	public static void main(String[] args) {
	
		/*
		 	
		 		Collection 객체들은 객체의 레퍼런스를 수집하는 객체니까
		 		배열처럼 여러 객체를 가지고 있는 그런 느낌의 객체...
				SET MAP LIST - interface
		  		
		  		List : 무한배열같은 느낌(인터페이스)
		  		- 주요 구현클래스 : Vector, ArrayList, LinkedList, Queue, Stack
		  		- 주요 메서드 : 
		  		add() : 리스트에 객체를 추가
		  		size() : 객체의 개수 반환 
		  		get(index) : 해당 인덱스의 객체 레퍼런스를 얻어와 
		 */
		List list = new ArrayList();
		list.add(1);
		list.add("3");
		list.add("67");
		list.add(3.1);
		list.add("후후후");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}// for end
		for(Object o:list) {
			System.out.println(o);
		}// for each end
	}//main() end
	
}// Ex1 end
