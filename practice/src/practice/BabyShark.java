package practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BabyShark {
	static int [][] map = new int[21][21];
	static int x,y;
	static int []xOp = {0,-1,0,1};
	static int []yOp = {-1,0,1,0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<pair> q = new PriorityQueue<>();		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j] = sc.nextInt();
				
				if(map[i][j] == 9) {
					x=i;
					y=j;
				}// if end
				else {
					q.add(new pair(i,j,map[i][j]));
				}
			}// for j end
		}//for i end
		
		
	}//main() end
	public class pair implements Comparable<pair>{
		int x;
		int y;
		int val;
		pair(int x,int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}//pair 생성자 end
		
		@Override
	    public int compareTo(pair p) {
	        return this.val <= p.val ? -1 : 1;
	    }
		
	}// pair class end
}// BabyShark class End
