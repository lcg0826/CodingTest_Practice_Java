package bronze_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1032 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    StringBuilder pattern = new StringBuilder();
	    boolean sameCheck = true;

	    String[] arr = new String[N];
	    for(int i = 0; i < N; i++) {
	        arr[i] = br.readLine();
	    }

	    for(int i=0; i<arr[0].length(); i++) {
	        for(int j=1; j<N; j++) {
	            if(arr[0].charAt(i) == arr[j].charAt(i)) {
	            	sameCheck = true;
	            }else {
	            	sameCheck = false;
	                break;
	            }
	        }

	        if(!sameCheck) {
	            pattern.append("?");
	        }else {
	            pattern.append(arr[0].charAt(i));
	        }
	    }
	    System.out.println(pattern.toString());
	}
}

