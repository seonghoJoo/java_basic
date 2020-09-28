package practice;
import java.util.*;
public class Main {
	//↑, ↖, ←, ↙, ↓, ↘, →, ↗
	static int[][] map = new int[5][5];
	static int[][] dir = new int[5][5];
	static int[] xDir = {-1,-1,0,1,1,1,0,-1};
	static int[] yDir = {0,-1,-1,-1,0,1,1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=8;j++) {
				if(j%2==1) {
					map[i][j/2+1] = sc.nextInt();
				}else {
					dir[i][j/2] = sc.nextInt();
				}// if~else end
			}// for j end
		}// for i end
		int t=1,flag=0;
		while(true) {
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=4;j++) {
					if(t>16) {
						flag=1;
						break;
					}
					if(t==map[i][j]) {
						int temp = map[i][j];
						
					}
					
				}//for j end
				if(flag==1)break;
			}// for i  end
		}// while end
	}// main() end

}// Main end
