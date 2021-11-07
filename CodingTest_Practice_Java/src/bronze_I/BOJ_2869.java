package bronze_I;

import java.util.Scanner;

public class BOJ_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        int temp = (v - b) / (a - b);
        if((v - b) % (a - b) != 0) {
            temp++;
        }
    System.out.println(temp);
    }
}
