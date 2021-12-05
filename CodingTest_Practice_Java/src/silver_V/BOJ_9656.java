package silver_V;

import java.util.*;

// 9656
// 돌게임 2
public class BOJ_9656 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
	}
}
