package chapter03;

public class ObjectTest04 {

	public static void main(String[] args) {
		Rect r1 = new Rect(10, 20);
		System.out.println(r1);
		
		Rect r2 = new Rect(10, 20);
		System.out.println(r1.equals(r2));
		
		Rect r3 = new Rect(40, 5);
		System.out.println(r1.equals(r3));
		
	}

}
