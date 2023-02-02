class Prac3{
	public void even_odd()
	{
		for(int i=1;i<=200;i++)
		{
			if((i%2)==0)
				System.out.println( i + " is Even");
			else 
				System.out.println(i +" is odd");
		
		}
		System.out.println();
	}
	public void sum_of()
	{
		int sum=0;
		for(int i=1;i<=200;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum is "+sum);
	}
	public static void main(String args[]){
		Prac3 p3=new Prac3();
		p3.even_odd();
		p3.sum_of();
	}

}