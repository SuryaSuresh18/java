interface Fruit
{
	String name="Apple";
	void sell();
	default void buy()
	{
		System.out.println("Fruits are bought by buyer");
	}
	static void eat()
	{
		System.out.println("Fruits are healthier");
	}
	
}
class Seller implements Fruit
{
	public void sell()
	{
		System.out.println("I am selling apple");
	}
}
class InterfaceExample{
	public static void main(String args[]){
		Fruit f =new Seller();//to call interface
		f.sell();
		f.buy();
		Fruit.eat();//static method called by classname.methodname
	}
}