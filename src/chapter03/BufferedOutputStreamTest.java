package chapter03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			//기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조스트림(기반스크립에 연결)
			bos = new BufferedOutputStream(fos, 5);

			//for(int i = '0'; i <= '9'; i++) {
			for(int i = 48; i <= 57; i++) {
				bos.write(i);
			}
		} catch (IOException e) {
			System.out.println( "error:" + e );
		} finally {
			try {
				// 보조스트림만 닫으면 기반스트림도 자동으로 닫힌다.
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
