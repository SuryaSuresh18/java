abstract class Car{
    abstract public void run();
	public void display()
	{
		System.out.println("Displaying from abstract class");
	}
}
class Honda extends Car{//sub class of abstract class car
     public void run(){
		 System.out.println("Displaying from inherited class");
	 }
	 public static void main(String args[])
	 {
		 Honda h =new Honda();
		 h.run();
		 h.display();
	 }
}