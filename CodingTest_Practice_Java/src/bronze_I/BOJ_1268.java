package bronze_I;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_1268 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 학생 수
	    int[][] std_table = new int[n][5]; // [학생수][5학년]
	    int grade = 0;
	    int num = 0;
	    
	    // 학생당 1학년부터 5학년까지의 값 입력
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < 5; j++) {
	        	std_table[i][j] = sc.nextInt();
	        }
	    }
	    
	    
	    // i : 0부터 학생 수 n 까지
	    for (int i = 0; i < n; i++) { // 학생 수
            Set<Integer> set = new HashSet<>(); // 중복 방지 위해 set 사용
            for (int j = 0; j < 5; j++) { // j는 0부터 5학년까지
                for (int k = 0; k < n; k++) {

                	if(i == k) {
                		continue;
                	}
                    if (std_table[i][j] == std_table[k][j]) {
                        set.add(k);
                    }
                }
            }
            if (num < set.size()) {
                num = set.size();
                grade = i + 1;
            }
        }
        if(grade == 0) {
            System.out.println(1);
        } else {
            System.out.println(grade);
        }
	}
	
}
