package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		Character c = new Character('c');
		Boolean b = new Boolean( true );
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);

		// Auto Boxing
		Integer i2 = 10;
		
		
		// Auto Unboxing
		//int j = i2.intValue() + 20;
		int j = i2 + 20;
		
		System.out.println(i2 + ":" + j);
	}

}
