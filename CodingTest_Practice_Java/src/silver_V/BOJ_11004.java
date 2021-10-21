package silver_V;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] sortArr = new int[n];
		
		for ( int i = 0; i < n; i++) { 
			sortArr[i] = sc.nextInt();
		}
		
		Arrays.sort(sortArr);
		
		System.out.println(sortArr[m-1]);
		
	}

}
