//Program to print Multiplication table using for loop
import java.util.Scanner;
class ForLoop{
	public void calcTable(int num){
		for(int i=1;i<=10;i++){
			//System.out.println("Value is "+ (num*i));
			System.out.println(num+ " X " + i + " = " + (num*i));
	}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for table");
		int num=sc.nextInt();
		ForLoop fl=new ForLoop();
		fl.calcTable(num);
	
}
}