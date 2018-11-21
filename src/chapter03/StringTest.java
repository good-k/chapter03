package chapter03;

public class StringTest {

	public static void main(String[] args) {
		String s = "c:\\temp";    // \\ => 역슬래시를 출력하기 위한 이스케이프
		String s1 = "\"hello\"";  // \" => "를 출력하기 위한 이스케이프
		
		System.out.println(s);
		System.out.println(s1);
		
		//  \t => tab
		//  \n => new line
		//  \r => carrige return
		System.out.print("hello\tworld\r\n");
		System.out.print("hello\tworld\n");
		
		char c = '\'';
		System.out.println(c);		
		
	}

}
