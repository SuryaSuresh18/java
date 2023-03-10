package my;
//Lab StringBuffer Example
public class StringBufferLab {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is StringBuffer");// String buffer created
		System.out.println(s1.append(" - This is a sample program"));//another string added to existing one
		System.out.println(s1.insert(21, "Object"));//at 21 position object string is added
		System.out.println(s1.reverse());//the string is reversed
		System.out.println(s1.replace(14, 20, "Builder"));//To replace buffer with builder
		
	}

}
