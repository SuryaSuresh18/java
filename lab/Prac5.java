public class Prac5{
	static void pattern(){
		int i,j,n=5;
		for (i = 1; i <= n; i++)
    {
        int ch = 65;
            for (j = i; j <= n; j++)
            {
                System.out.print((char)(65+j));
            }
        System.out.println();
    }

	}
	public static void main(String args[])
	{
		pattern();
	}
	}