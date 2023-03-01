package my;

public class StringMutableEg {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Anudip Foundation");
		System.out.println(s1.append(" Vashi"));//print at the end of string s1 
		System.out.println(s1);//New string visible 
		System.out.println(s1.insert(0, "NGO - "));
		StringBuilder s2 = new StringBuilder("Java Professional");
		System.out.println(s2.replace(4,8,"java"));
		System.out.println(s2.delete(5, 9));
		System.out.println(s2.reverse());
		
		

	}

}
