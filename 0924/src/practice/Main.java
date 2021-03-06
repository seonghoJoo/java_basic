package practice;

import java.util.Scanner;
import java.util.*;
public class Main {
	static int[][] map = new int[21][21];
	static int dx[] = {0, 0, 1, -1};
	static int dy[] = {-1, 1, 0, 0};
	static int n;
	
	static int cnt=0;
	public static void main(String[] args) {
		Queue<point> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 9) {
					q.add(new point(i,j,1));
				}// if end
			}// for j end
		}// for i end
		int sz=0;
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			int val = q.peek().val;
			q.poll();
			if(x <1 || x> n || y<1 || y>n) {
				continue;
			}// if end
			
			for(int i=0; i<4; i++){
				// x, y는 현재 위치에서의 x, y좌표
			    // nx, ny는 상하좌우 위치에서의 x, y좌표로 x또는 y값이 딱 1만큼 변화합니다.
				int nx = x + dx[i];
			    int ny = y + dy[i];
			    if(map[nx][ny] <= sz) {
			    	
			    }
			}//for i end
		
			
		}//while q end
		
		
	}// main() end
	public static class point{
		int x;
		int y;
		int val;
		point(int x, int y, int val){
			this.x = x;
			this.y = y;
			this.val = val;
		}// point() end
	}//point end

}//Main end
