package bronze_I;

import java.util.Scanner;

public class BOJ_11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	      
	      int result = factorial(n) / (factorial(m) * factorial(n - m));
	      System.out.println(result);
	      }
	
	  public static int factorial(int n) {
		  
	      int total = 1;
	      
	      for(int i = 1; i <= n; i++) {
	          total *= i;
	      }
	      
	      return total;
	}

}
