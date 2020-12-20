package practice;

import java.util.Scanner;

public class KnapSack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[]arr = new int[k+1];
		int[]dy = new int[k+1];
		for(int i=0;i<n;i++) {
			int w = sc.nextInt();
			int val = sc.nextInt();
			for(int j=w;j<=k;j++) {
				if(dy[j] < dy[j-w]+val) {
					dy[j] = dy[j-w] + val;
				}
			}
		}
		//dy[j-w] + val
		
		System.out.println(dy[k]);
		
	}
	
	public static class Bag{
		int w;
		int val;
		public Bag(int w,int val) {
			this.w = w;
			this.val = val;
		}
	}

}

/*
 *
 *
4 11
5 12
3 8
6 14
4 8 		
 		
 * 
 * */
