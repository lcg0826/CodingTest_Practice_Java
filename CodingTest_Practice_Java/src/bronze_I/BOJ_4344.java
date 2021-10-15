package bronze_I;

import java.util.Scanner;

public class BOJ_4344 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 테스트 케이스
		
		for(int i = 0; i < n; i++) {

			int std_num = sc.nextInt(); // 평균 내려는 학생의 수
			int std_hap = 0; // 학생 점수 합
			double std_avg = 0; // 평균
			
			int arr[] = new int[std_num];
			
			for(int j = 0; j < std_num; j++) {
				
				arr[j] = sc.nextInt();
				
				std_hap += arr[j];
				
				if(j == (std_num - 1)) {
					std_avg = std_hap / std_num; // 학생 점수 합 / 학생수
					int std_cnt = 0; // 평균 넘는 사람
					
					for(int k = 0; k < arr.length; k++) {
						if(arr[k] > std_avg) {
							std_cnt += 1;
						}
					}
					double result = (double)std_cnt / (double)std_num * 100;
					System.out.println(String.format("%.3f",result) + "%");
				}
				
				
			}
			
		}
		
		
	}

}
