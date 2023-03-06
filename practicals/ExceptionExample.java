package my;
import java.util.InputMismatchException;
//import java.lang.ArithmeticException;
import java.util.Scanner;
public class ExceptionExample {
public void division(int a, int b){
		if(b==0){
			try{
				int c = a/b;
				System.out.println("Result: "+c);
			}
			catch(Exception i){
				System.out.println(i);//ArithmeticException
			}
			
		}
	}

	public static void main(String[] args) {
		ExceptionExample eg = new ExceptionExample();
		System.out.println("Enter two nos: ");
		Scanner sc = new Scanner(System.in);
		
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			eg.division(a,b);
			int c = a/b;
			System.out.println("Result: "+c);
			}
		catch(InputMismatchException e)
		{
			System.out.println(e);
			
		}
	}

}
