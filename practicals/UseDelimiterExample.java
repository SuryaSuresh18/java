import java.util.Scanner;

class UseDelimiterExample{
	public static void main(String args[])
	{
		Scanner sc=new Scanner("Ramesh is a good boy");
		//System.out.println("String in s is "+sc.nextLine());//Stops when space is encountered
		sc.useDelimiter("a");//Ramesh is considered as space hence it won't appear
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		
		Scanner s=new Scanner("Ramesh is a good boy");
		s.useDelimiter("/");//Ramesh will break when / occurs
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}//for space(\\s)
}