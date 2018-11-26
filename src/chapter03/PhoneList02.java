package chapter03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		try {
			File file = new File("phone.txt");
			
			if(file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("============== 파일정보 ============");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
	
			System.out.println("========== 전화번호 리스트 ==========");
			scanner = new Scanner(file);
			
			//처리
			while(scanner.hasNextLine()) {
				String name = scanner.next();   //이름
//				String phone1 = scanner.next(); //phone1
//				String phone2 = scanner.next(); //phone2
//				String phone3 = scanner.next(); //phone3
				int phone1 = scanner.nextInt();
				int phone2 = scanner.nextInt();
				int phone3 = scanner.nextInt();
				
				System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);	
			}
			
		} catch( IOException ex ) {
			System.out.println("error:" + ex);
		} finally {
			scanner.close();
		}
		
	}

}
