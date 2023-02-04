class Owner{//Base class or super
	int area=1000;
	String dateOfPurchase="06-07-2001";
	String name="Altaf";
	boolean noc=true;
	public void renew(){
		String color="blue";
		String flat="2bhk";
		int ceilheight=8;
		System.out.println("New Flat value: "+(color +" "+ flat +" "+ceilheight));	
	}
	
}
class New_Owner extends Owner{//dervived class, sub or child class
	String dateOfRegister="3-02-2023";
	double flatvalue=2.300000;
	String name="Jevan";
	public void display(){
		System.out.println("Area is: "+area);//access parent property
		System.out.println("Owner Name is: "+super.name);//access parent property value
		System.out.println("Current Flat Price is: "+flatvalue);
		System.out.println("New Owner Name is: "+name);
	}
	public void renew(){
		String color="offwhite";
		String flat="3bhk";
		int ceilheight=10;
		System.out.println("New Flat value: "+(color +" "+ flat +" "+ceilheight));
		super.renew();//call parent method
	}
}
class Next_Owner extends Owner{//mutiple inheritance
	String name="Sam";
	public void display(){

		System.out.println("Owner Name is: "+super.name);//access parent property value
		
		System.out.println("New Owner Name is: "+name);
	}
	public void renew(){
		String color="offwhite";
		String flat="3bhk";
		int ceilheight=10;
		System.out.println("New Flat value: "+(color +" "+ flat +" "+ceilheight));
		super.renew();//call parent method
	}
}

class InheritanceExample{
	public static void main(String args[]){
		New_Owner ow=new New_Owner();//child class obj
		ow.display();//invoke child class to access child and parent property
	    ow.renew();//invoke child method
	}
}