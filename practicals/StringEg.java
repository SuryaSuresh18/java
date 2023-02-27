package my;
public class StringEg {

	public static void main(String[] args) {
		String a1 = "Anudip";
		String a3 = new String("anudip");
		String a2 = "Anudip Foundatiom Vashi";
		String a4 = "Anudip";
		
		//equals() compares values of string
		System.out.println(a1.equals(a2));//compares values of string
		System.out.println(a1.equals(a3));//case mismatch
		System.out.println(a1.equalsIgnoreCase(a3));
		
		//== compares (l.h.s to r.h.s) values case sensitive
		System.out.println(a1==a2);
		System.out.println(a1==a4);
		
		//lexicographically(Alphabetical order)
		String a5 = "apple";
		String a6 = "america";
		System.out.println(a6.compareTo(a5));//displays negative no(a6<a5)
		System.out.println(a1.compareTo(a4));//equal 0
		System.out.println(a2.compareTo(a1));//displays positive no(a2>a1)
		
		//concatenation
		System.out.println(a5+ " "+a6);
		System.out.println(60+70+"my"+90+74);//before string (addition operation is performed) after that only concatenation
		System.out.println(a5.concat(a6));
		
		//sub string
		System.out.println(a2.substring(0,6));//(start,end),exclude start and end,(0,5)
		System.out.println(a2.substring(6));//starts from index 6
		System.out.println(a2.substring(17));
	}

}
