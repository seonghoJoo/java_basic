package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		Collections.sort(list);
		int left = 0, right = n-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(list.get(mid)>target) {
				right = mid;
			}else if(list.get(mid) < target) {
				left = mid+1;
			}else {
				System.out.println(mid+1);
				break;
			}
		}
	}//main() end
}// Main end
//8 32 23 87 65 12 57 32 99 81
