package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int max=-1;
		for(int i=0;i<n;i++) {
			int temp = sc.nextInt();
			list.add(temp);
			if(temp > max)
				max = temp;
		}
		int left = 0; 
		int right = max;
		int answer=0;
		while(left <= right) {
			int mid = (left+right)/2;
			int sum=0;
			for(int i=0;i<n;i++) {
				sum += list.get(i) / mid; 
			}
			System.out.println(sum);
			if(sum == target) {
				if(answer == mid) {
					System.out.println(answer);
					break;
				}
				left = mid;
				answer = mid;
			}else if(sum < target) {
				// 20 / 10 -> 2 5
				right = mid; 
				System.out.println("right : "  + right);
			}else if(sum > target) {
				left = mid+1;
				System.out.println("left : "  + left);
			}//if~else if end
		}
	}

}
//4 11 802 743 457 539

