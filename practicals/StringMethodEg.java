package my;

public class StringMethodEg {

	public static void main(String[] args) {
		String a = "Anudip Foundation";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("Anu"));//return true or false
		System.out.println(a.endsWith("tion"));//return true or false
		System.out.println(a.charAt(8));//returns 6th position element
		System.out.println(a.length());//complete length of string
		System.out.println(a.replace("Anudip","Anudeep"));
		System.out.println(a);
		
		int num = 55;
		String b = String.valueOf(num);//"55"
		System.out.println(b+55);//concatenation 
	}

}
