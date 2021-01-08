package app;

import vo.BlackMirror;

public class Ex1 {
	
	public static void main(String[] args) {
		
		BlackMirror bm = new BlackMirror();
		bm.setNo(10);
		bm.setName("코코");
		
		System.out.println(bm.getName());
		System.out.println(bm.getNo());
		System.out.println(bm.getProductDate());
		
		
	}

}
