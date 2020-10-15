package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
	//arrayList 멀티스레드 x 더 빠름
	// vector 멀티스레드 o
	public static void main(String[] args) {
				
		List redVelvet = new ArrayList();
		redVelvet.add("아이린");
		redVelvet.add("웬디");
		redVelvet.add("조이");
		redVelvet.add("예리");
		redVelvet.add("슬기");
		for (int i = 0; i < redVelvet.size(); i++) {
			System.out.println(redVelvet.get(i));
		}// for end
		System.out.println();
		for (Object object : redVelvet) {
			System.out.println(object);
		}//for end
		
		
		
	}
}
