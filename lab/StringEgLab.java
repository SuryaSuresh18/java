package my;
//Lab String Example
public class StringEgLab {

	public static void main(String[] args) {
		String a = "Welcome to Java World";//the string given
		System.out.println("Character at 5 th position: "+a.charAt(5));//To find the character at position 5
		System.out.println("Comapare the string with another lexicographically: "+a.compareTo("Welcome"));//to compare string lexicographically
		String b = "Let us learn-";//new string created
		System.out.println(b+a);//Concatenation of string
		System.out.println("Occurrence of a: "+a.indexOf(a));//find the index of a
		System.out.println(a.replace("a", "e"));//to replace a with e
		System.out.println(a.substring(4,10));//Displays string from 4th position to 10 th position
		System.out.println("Display string in lower case"+a.toLowerCase());//To display string a in lower case
	}

}
