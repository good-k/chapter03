package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		String s = "aBcAbcabcABC";
		
		System.out.println( s.length() );
		System.out.println( s.charAt(2) );
		System.out.println( s.indexOf( "abc" ));
		System.out.println( s.indexOf( "abc", 7 ));
		System.out.println( s.substring( 3 ) );
		System.out.println( s.substring( 3, 6 ) );
		
		String a = "        ab cd     ";
		String b = "efg,dewdwq,dwq";
		
		String c = a.concat(b);
		System.out.println(c);
		
		System.out.println("---" + a.trim() + "---");
		System.out.println("---" + a.replaceAll(" ", "") + "---");
		
		String[] t = c.split(",");
//		for(int i = 0; i < t.length; i++) {
//			System.out.println(t[i]);
//		}
		// for-each문
		for(String k : t) {
			System.out.println(k);
		}
		
		
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello");
		sb.append(" World");
		sb.append( " java" );
		System.out.println(sb);

		// + 연산자
		String str = "Hello" + " World" + " Java";
//		String str = new StringBuffer("Hello").
//						append( " World" ).
//						append( " Java" ).
//						toString();
		
		String str2 = "";
		for(int i = 0; i < 100000; i++) {
			str2 = str2 + i;
		}
			
		StringBuffer sb2 = new StringBuffer("");
		for(int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		
		
	}

}
