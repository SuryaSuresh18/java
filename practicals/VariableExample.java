class VariableExample{
    static int num = 55;//static variable
	long num1 = 54321980;//instance
    
	public 	void display(){//non-static method
		char a = 'M';//local
		double num2 = 45.355;
		System.out.println("Local variable value : "+a);//printing local variable
		System.out.println("Local variable value : "+num2);
	}
	
	public static void calc(){
		double b = 99.34;
		double c = 45.23;
		double res=b*c;
		System.out.println("Result is : " +res);
	}
	public static void main(String args[]){
		VariableExample obj = new VariableExample();//object creation
		obj.display();// invoke non-static method with obj
		calc();//invoke static method
		System.out.println("Instance variable value : " +obj.num1);//calling instance variable
	//	System.out.println("Static variable value: "+ VariableExample.num);
		System.out.println("Static variable value: "+ num);
		//static variable can be called directly
    }
}