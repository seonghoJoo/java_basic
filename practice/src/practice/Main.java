package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int[][] arr = new int[v+1][v+1];
		for(int i=0;i<e;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int val = sc.nextInt();
			arr[from][to] = val;
		}
		for(int i=1;i<=v;i++) {
			for(int j=1;j<=v;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}//main() end
	public static class V{
		int from;
		int to;
		int val;
		
		V(int from,int to,int val){
			this.from = from;
			this.to = to;
			this.val = val;
		}
	}
	
}// Main end
