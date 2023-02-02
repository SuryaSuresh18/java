//Write a program to Print numbers from 1-100, which are divisible by 5, and if the number is greater than 40class Prac2{
class Prac2{
	public void Div(){
		for(int i=1;i<=100;i++)
		{
			if(((i%5)==0) && (i>=40)){
				System.out.print(i+" ");
			}
	
			
		}
	}
	public static void main(String args[])
	{
		Prac2 p2=new Prac2();
		p2.Div();
		
	}

}