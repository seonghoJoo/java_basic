package practice;

public class DisjointSet {
	
	public static int[] arr = new int [101];
	public static int find(int a) {
		if(a==arr[a]) return a;
		//메모제이션
		else return arr[a]=find(arr[a]);
	}
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a!=b) arr[a] = b;
	}
	
	public static void main(String[] args) {
		
	}//main() end
}
