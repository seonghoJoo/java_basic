package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int INF = 987654321;
	static int x,y,n;
	static int []xDir = {-1,0,1,0};
	static int []yDir = {0,-1,0,1};
	static int [][]map = new int[21][21];
	static boolean [][]visited = new boolean[21][21];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 9) {
					x = i;
					y = j;
				}else if(map[i][j] > 0) {
				
				}// if~else end
				
			}// for j end
		}// for i end
		visited[x][y] = true;
		System.out.println(solve(x,y));
	}// main() end

	public static class Point{
		int x;
		int y;
		int val;
		Point(int x,int y,int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}//Point() end
	}//Point class end
	public static int solve(int r,int c) {
		int ret=0;
		int size = 2, cnt = 2;
		Point p = new Point(r,c,0);
		p.val = INF;
		Queue<Point> q = new LinkedList<>();
		q.add(p);
		
		while(!q.isEmpty()) {
			Point curr = q.peek();
			int x = curr.x;
			int y = curr.y;
			int val = curr.val;
			
			q.poll();
			if(curr.val > p.val) break;	
			if(map[x][y] >size) {
				continue;
			}else if(map[x][y]!=0 && map[x][y]<size) {
				if(curr.val < p.val) {
					p.val = curr.val;
				}else if(curr.val == p.val) {
					if(curr.x < p.x) {
						p = curr;
					}else if(curr.x == p.x && curr.y<p.y) {
						p = curr;
					}
					continue;
					
				}
			}//if~else 종료
			for(int i=0;i<4;i++) {
				int tX = x+xDir[i];
				int tY = y+yDir[i];
				if(tX >=1 && tX<=n && tY>=1 && tY<=n) {
					if(visited[tX][tY] == true) {
						continue;
					}
					visited[tX][tY] = true;
					q.add(new Point(tX,tY,val+1));
					
				}else{
					continue;//영역 내 end
				}
			}//for i end
		}// while q end
		
		return ret;
	}// solve() end
}//Main class end
