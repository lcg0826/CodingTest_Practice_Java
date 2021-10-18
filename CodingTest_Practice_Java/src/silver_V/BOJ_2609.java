package silver_V;

import java.util.Scanner;

public class BOJ_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = gcd(num1, num2);
		
		System.out.println(result1);
		System.out.println(num1 * num2 / result1);
	}
    
	public static int gcd(int n1, int n2){    // 최대 공약수
		if(n2 == 0) {
			return n1;
		}
		
		return gcd(n2, n1 % n2);
	}
}
