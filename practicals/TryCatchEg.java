package my;

public class TryCatchEg {
	public static void main(String[] args) {
		try{//may throw exception
		//	int num = 88/0;
		//	String num1 = null;
		//	System.out.println(num1.length());//NullPointerException

			
			String m = "java";
			int i = Integer.parseInt(m);
			System.out.println(i);//NumberFormatException
		}catch(Exception e){//handle exception
			System.out.println(e);//System generated error message
			//System.out.println("Cannot divide by zero");//e is exception object
		}
	}
//NumberFormatException not present hence throws error
}
