package silver_V;
import java.util.Scanner;

// 거스름돈
// 14916
// https://www.acmicpc.net/problem/14916 
public class BOJ_14916{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine().trim());
        int coin = 0;
        
        if(input % 5 == 0) {
            System.out.println(input / 5);
        } else {
            while(true) {
                
                if(input < 0) {
                    System.out.println(-1);
                    break;
                }
                
                if(input == 0) {
                    System.out.println(coin);
                    break;
                }
                
                input -= 2;
                coin++;
                
                if(input % 5 == 0) {
                    coin += input / 5;
                    System.out.println(coin);
                    break;
                }
            }
        }
    }
}