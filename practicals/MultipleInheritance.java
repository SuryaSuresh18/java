//MultipleInheritance
/*class Parent1
{
	void discipline()
	{
		System.out.println("Guidelines given by father");
	}
}
class Parent2
{
	void discipline()
	{
		System.out.println("Guidelines given by father");
	}
}
class Child extends Parent1 //inherits frm both parent
{
	
}
*/
//using interface
interface Parent1
{
	void discipline();//method name should be in verbs
}
interface Parent2
{
	void discipline();
}
class Child implements Parent1,Parent2
{
	public void discipline()
	{
		System.out.println("I'm disciplined");
	}
	void follow(){
		System.out.println("I'm following all the rules");
	}
}
public class MultipleInheritance{
  public static void main(String args[]){
	 Child c = new Child();
	  c.discipline();
	  c.follow();//JVM get's confused hence multiple inheritance is not supported
  }
}