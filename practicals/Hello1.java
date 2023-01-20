class My{
	public static void display(){//static method
		System.out.println("Hi....");
	}
}
class Hello1{//start class with name
    public static void main(String args[]){ //entry point
		System.out.println("It's my first program");
		
		My.display();//classname.methodname
	}
}//end class