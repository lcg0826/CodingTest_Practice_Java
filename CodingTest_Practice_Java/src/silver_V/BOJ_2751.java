package silver_V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int sort_num = Integer.parseInt(br.readLine());
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        for (int i = 0; i < sort_num; i++){
	            arr.add(Integer.parseInt(br.readLine()));
	        }
	        Collections.sort(arr);
	        for (int i = 0; i < arr.size(); i++){
	            System.out.println(arr.get(i));
	        }
	}

}
