package bronze_I;

import java.util.Scanner;

public class BOJ_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String str = sc.next().toUpperCase(); // 입력 값을 대문자로 치환

	        int[] count = new int[26]; // 입력값 영어 알파벳 26자리

	        for (int i = 0; i < str.length(); i++) {
	            int num = str.charAt(i) -'A' ;
	            count[num]++;
	        }

	        int max = 0;
	        char ch = '?'; // 알파벳 중복처리
	        for (int i = 0; i < count.length; i++) {
	            if(max < count[i]){
	                max = count[i];
	                ch = (char)(i+'A');
	            } else if (max == count[i]){
	                ch = '?';
	            }
	        }
	        System.out.println(ch);

	}

}
