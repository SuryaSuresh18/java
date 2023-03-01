package my;
class My
{
	int num;
	String name;
	
	public My(int num,String name){
		super();
		this.num=num;
		this.name=name;
	}

public String toString(){//bit values are converted into desired output
	return num + " " + name;
}
}
public class ToStringExample {

	public static void main(String[] args) {
		My m1 = new My(12,"mango");
		My m2 = new My(13,"watermelon");
		
		System.out.println(m1);//m1.toString();whenever we want object to return values use toString method
		System.out.println(m2);
		//If toString not used it will print hash values
	}
}
