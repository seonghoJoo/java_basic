package practice;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

import practice.Kruskal.Edge;

public class Dijkstra {
	
	public static int[] arr = new int[21];
	public static boolean[] visit = new boolean[21];
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Edge>[] list = new ArrayList[21];
		for(int i=0;i<21;i++) {
			list[i] = new ArrayList<Edge>();
		}
		for(int i=2;i<21;i++) {
			arr[i] = Integer.MAX_VALUE;
		}//for i end
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		
		
		
		for(int i=0;i<m;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int val = sc.nextInt();
			list[start].add(new Edge(end,val));
		}//for i end
		
		
		
	}//main() end
	public static class Edge implements Comparable<Edge>{
		int end;
		int val;
		
		public Edge(int end,int val) {
			this.end = end;
			this.val = val;
		}
		@Override
		public int compareTo(Edge e) {
			return this.val >=e.val? 1:-1;
		}
		
	}
}
