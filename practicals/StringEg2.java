package my;
import java.util.Scanner;
public class StringEg2 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value for string : ");
		String A = sc.next();
		String B = sc.next();
		int sum = A.length()+B.length();
		System.out.println("Sum of two strings: "+sum);
		System.out.println("If string A is greater than B returns positive number:"+A.compareTo(B));
		String c = A.substring(0,1);
		String d = B.substring(0,1);
		System.out.println(c.toUpperCase()+"ello"+" "+d.toUpperCase()+"orld");
	}

}
