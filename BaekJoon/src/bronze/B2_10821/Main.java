package bronze.B2_10821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt =1; 
		for(int i=0; i<str.length(); i++) {
			if( str.charAt(i)== ',') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
