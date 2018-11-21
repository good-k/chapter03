package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		String s = "12345";
		
		int i = Integer.parseInt(s);
		String s2 = String.valueOf(i);
		
		System.out.println(s + ":" + s2);
		
		int num = Character.getNumericValue('A');
		System.out.println(num);
		
		//2진수
		String s3 = Integer.toBinaryString(13);
		System.out.println(s3);
		
		//16진수
		String s4 = Integer.toHexString( 255 );
		System.out.println(s4);
		
		
	}

}
