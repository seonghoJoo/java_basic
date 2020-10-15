package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	
	
	public static void main(String[] args) {
		/*
				제네릭은 자료형을 고정시키는 목적으로 사용됨
				
				<자료형>
				
		 */
		
		
		/*
		  		1995년 고슬링 형 List list = new ArrayList();
		  		모든 객체가 다 들어가서 기부니가 좋았었음 확장성이 좋네? 착각함
		  		o.substring 안나옴
		 		
		 		특정한 자료형으로 형을 고정시키자-> generic
		 */
		List<String> list = new ArrayList<String>();
		list.add("조이");
		list.add("웬디");
//		list.add(3);
		list.add("아이린");
		list.add("슬기");
		list.add("예리");
		
		for (Object o : list) {
			if(o instanceof String) {
				String s = (String) o;
				System.out.println(s.substring(1));
			}
		}// for end
		for (String string : list) {
			System.out.println(string.substring(1));
		}
	}//main() end
}//Ex3 end
