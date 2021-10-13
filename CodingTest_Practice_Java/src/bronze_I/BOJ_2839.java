package bronze_I;

import java.util.Scanner;

public class BOJ_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int hap = 0;
		
		while(true) {
			if(n % 5 == 0) {
				hap += n / 5;
				System.out.println(hap);  
				break;
			} else {
				n -= 3;
				hap++;
			}
			
			if(n < 0) {
				System.out.println("-1");
				break;
			}
			
		}
			
	
	}

}
