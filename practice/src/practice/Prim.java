package practice;

import java.util.ArrayList;
import java.util.Scanner;

import practice.Kruskal.Edge;

//Priority Queue 활용
public class Prim {
	public static int[] arr = new int[101];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Edge> list = new ArrayList<>();
		for(int i=1;i<101;i++) {
			arr[i] = i;
		}
		for(int i=0;i<m;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int val = sc.nextInt();
			list.add(new Edge(start,end,val));
		}//for i end
		
		
		
	}
	
	public static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int val;
		
		public Edge(int start,int end,int val) {
			this.start = start;
			this.end = end;
			this.val = val;
		}
		@Override
		public int compareTo(Edge e) {
			return this.val <=e.val? 1:-1;
		}
		
	}

}
