class Animal
{
	void bark()
	{
		System.out.println("Animal is barking");
	}
}
class  Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Overriding{
	public static void main(String args[])
	{
		Dog d =new Dog();
		d.bark();//though child inherits frm parent but O/P of child will be displayed
        Animal a = new Animal();
		a.bark();
		
	}
}