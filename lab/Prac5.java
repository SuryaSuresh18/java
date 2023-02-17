/*
Write a program to print Left down alphabet triangle pattern using loop
ABCDE
ABCD
ABC
AB
A
*/
public class Prac5{
	static void pattern(){
		int i,j,n=5;
		for (i = 5; i >= 0; i--)
    {
        int ch = 65;
            for (j = 0; j <= i; j++)
            {
                System.out.print((char)(ch + j)+ " ");
            }
        System.out.println();
    }

	}
	public static void main(String args[])
	{
		pattern();
	}
	}
