package practice;

import java.util.*;

public class dfs_1 {
	public static int [][]dy = new int[21][21];
	public static int memo(int n,int r) {
		if(dy[n][r]>0) return dy[n][r];
		if(r==0 || n==r) {
			return 1;
		}else return dy[n][r]=memo(n-1,r-1) + memo(n-1,r);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(memo(n,r));
	}
}//dfs_1 end
