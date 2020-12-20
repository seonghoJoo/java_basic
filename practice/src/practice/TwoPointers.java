package practice;

import java.util.*;
public class TwoPointers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[1501];
		int n = sc.nextInt();
		a[1] = 1;
		int index=2;
		int p2=1,p3=1,p5=1;
		int min = Integer.MAX_VALUE;
		for(int i=2;i<=n;i++) {
			if(a[p2]*2 < a[p3]*3) min = a[p2] * 2;
			System.out.print(a[index-1] + " ");
		}
		System.out.println(a[n]);
		
		
	}//main() end
	
}//TwoPointers
