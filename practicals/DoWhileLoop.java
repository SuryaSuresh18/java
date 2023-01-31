//Program to print Multiplication table using do while loop
import java.util.Scanner;
class DoWhileLoop{
	public void calcTable(int num){
		int i=1;//initialization before do
		do{
			//System.out.println("Value is "+ (num*i));
			System.out.println(num+ " X " + i + " = " + (num*i));
			i=i+2;
	    }
		while(i<=10);//will run atleast once
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for table");
		int num=sc.nextInt();
		DoWhileLoop dwl=new DoWhileLoop();
		dwl.calcTable(num);
	
}
}