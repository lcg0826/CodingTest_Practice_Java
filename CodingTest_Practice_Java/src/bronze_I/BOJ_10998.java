package bronze_I;

import java.util.Scanner;

public class BOJ_10998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		
		
		if(str.equals(reverse))
			System.out.println("1");
		else 
			System.out.println("0");
	}

}
