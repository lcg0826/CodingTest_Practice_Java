package bronze_I;

import java.util.Scanner;

public class BOJ_9625 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 					A B
		// 1. A 			1 0
		// 2. B 			0 1
		// 3. BA 			1 1
		// 4. BAB		 	1 2
		// 5. BABBA 		2 3
		// 6. BABBABAB 		3 5
		// 7. BABBABABBABBA 5 8
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		int A = 0, B = 1,sum = 0;
		
		for(int i=1; i<num; i++) {
			sum = A+B;
			A=B;
			B=sum;
		}
		
		System.out.println(A+" "+B);	
	}

}
