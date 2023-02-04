//Example of Hierarchical 
class Vehicle{ //parent class
    String t1="Two-wheeler";

}
class New_Vehicle extends Vehicle{// child of vehicle
	String t1="Three-wheeler";
	public void display(){
		
		System.out.println("Type of vehicle: "+super.t1);
		System.out.println("Type of vehicle: "+t1);
	}
}
class V1 extends Vehicle{//child of new_vehicle
	String t2="Four-wheeler";
	public void name(){
		System.out.println("Type of vehicle: "+super.t1);//new_vehicle property called
		System.out.println("Type of vehicle: "+t2);
		
	}
}
class InheritanceExample2{
	public static void main(String args[]){
		New_Vehicle nv=new New_Vehicle();
		nv.display();
		V1 b =new V1();//child class v1 obj
		b.name();
	}
}