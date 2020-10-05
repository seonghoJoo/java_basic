package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int cnt=0;
	static int rLimit=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		rLimit = sc.nextInt();
		int[] arr = new int[n];
		boolean[] temp = new boolean[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		dfs(0,0,arr,temp);
		System.out.println(cnt);
	}//main() end
	public static void dfs(int level,int r,int[] arr,boolean[] temp) {
		if(r==rLimit) {
			for(int i=0;i<arr.length;i++) {
				if(temp[i] == true) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			cnt++;
			return;
		}else if(level == arr.length) {
			return;
		}
		else {
			
				temp[level] = true;
				dfs(level+1,r+1,arr,temp);
				temp[level] = false;
				dfs(level+1,r,arr,temp);
			
		}
	}
	
}// Main end
