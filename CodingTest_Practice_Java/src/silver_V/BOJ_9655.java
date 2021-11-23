package silver_V;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9655 {

	// DP , 돌 게임
	// 짝수면 창영이 승리
	// 홀수면 상근이 승리
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num % 2 == 0) {
			bw.write("CY");
		}
		else {
			bw.write("SK");
		}

		bw.flush();
		bw.close();
	}

}
