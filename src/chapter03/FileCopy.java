package chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("ingam.jpg");
			out = new FileOutputStream("imgam.back.jpg");
			
			int data = -1;
			while( (data = in.read()) != -1 ) {
				out.write(data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error:" + e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(in != null) {
					in.close();
				}
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
