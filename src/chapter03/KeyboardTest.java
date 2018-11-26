package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			//기반 스트림은 표준입력 System.in(바이트기반)

			//보조 스트림(byte -> char)
			InputStreamReader isr = 
					new InputStreamReader(System.in, "UTF-8");
			
			//보조 스트림(char|char|char|...|\n -> "charcharchar...")
			//라인 단위로 읽음 
			br = new BufferedReader(isr);
			
			String line = null;
			while( (line = br.readLine()) != null ) {
				if(line.equals("exit") == true) {
					break;
				}
				System.out.println(">>" + line);
			}
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
