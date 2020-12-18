package practice;

import java.util.Scanner;

public class Permutaion {
	public static int cnt = 0;
	public static void recur(int x,int n,int m,boolean[] visit, int[] arr,int[] res) {
		if(x==n) {
			for(int i=0;i<m;i++) {
				System.out.print(res[i]+ " ");
			}
			System.out.println();
			cnt++;
			return;
		}else {
			for(int i=0;i<n;i++) {
				if(visit[i] == false) {
					res[x] = arr[i];
					visit[i] = true;
					recur(x+1,n,m,visit,arr,res);
					visit[i] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[16];
		int[] res = new int[16];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean[] visit = new boolean[16];
		recur(0,n,m,visit,arr,res);
		System.out.println(cnt);
	}
	
}
