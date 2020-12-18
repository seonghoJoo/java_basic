package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.sound.sampled.ReverbType;

//Union Find 활용
public class Kruskal {
	
	public static int[] arr = new int[101];
	public static int find(int a) {
		if(a==arr[a]) return a;
		else return arr[a] = find(arr[a]);
	}
	public static void union(int a,int b) {
		a = find(a);
		b = find(b);
		if(a!=b) arr[a]=b;
	}
	
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
		int sum = 0;
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			Edge e = list.get(i);
			
			if(find(e.start)!=find(e.end)) {
				union(e.start,e.end);
				sum+=e.val;
			}
		}
		System.out.println(sum);
	}//main() end
	
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
}//Kruskal end
