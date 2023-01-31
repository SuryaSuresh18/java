//Program to print Multiplication table using while loop
import java.util.Scanner;
class WhileLoop{
	public void calcTable(int num){
		int i =1;//initialization i=10
		while(i<=10){//condition while(i>=1)//dec
			//System.out.println("Value is "+ (num*i));
			System.out.println(num+ " X " + i + " = " + (num*i));
			i=i+2;//i=i+1(inc/dec)
	
	}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no for table");
		int num=sc.nextInt();
		WhileLoop fl=new WhileLoop();
		fl.calcTable(num);
	
}
}