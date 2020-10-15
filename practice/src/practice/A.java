package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public String toString() {
		return "A";
	}
	private void A() {
		System.out.println("A");
		
	}
	public static void main(String[] args) {
		Object[] o = {new A(),"3",3};
		String s = new String("3");
		
		System.out.println(o[0] instanceof A);
		System.out.println(o[1] instanceof String);
		System.out.println(o[2] instanceof Integer);
	}
	
}// Main end
