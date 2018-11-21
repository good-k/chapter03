package chapter03;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		// equals를 사용할 때 주의할 점
		System.out.println( equalHello( null ) );
		if( "hello".equals(s5) ) {
		}
		
	}
	
	private static boolean equalHello(String s) {
		return "hello".equals(s); 
	}
}
