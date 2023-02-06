//Inheritance Has a relationship(indirect employee - depart)
class Idproof{
    int inum;
    String city;
	String state;
	int pincode;
	String dob;
	Idproof(int inum,String city,String state,int pincode,String dob)// Parametrized constructor
	{
		this.inum=inum;
		this.city=city;
	    this.state=state;
	    this.pincode=pincode;
	    this.dob=dob;
	}
}
class Student{
    int id;
	String name;
	String emailid;
	long contact;
    Idproof idp;//reference of Idproof class(has a reference)
	Student(int id,String name,String emailid,long contact,Idproof idp)// Parametrized constructor
	{
		this.id=id;
	    this.name=name;
	    this.emailid=emailid;
	    this.contact=contact;
	    this.idp=idp;
	}
	public void show(){
	System.out.println(id +" "+name+" "+emailid+" "+contact);
	System.out.println(idp.inum+" "+idp.city+" "+idp.state+" "+idp.pincode+" "+idp.dob);
	}

}
class AggregationExample{
	public static void main(String args[])
	{
		Idproof i=new Idproof(101,"mum","mh",12345,"12-01-2001");
		Idproof i1=new Idproof(101,"hyd","tel",33345,"08-01-2002");
		Idproof i2=new Idproof(101,"ncr","delhi",22345,"30-01-2003");
		
		Student s = new Student(1,"ram","ram@gmail.com",9762329,i);//i is reference obj
		Student s1 = new Student(2,"ravi","ravi@gmail.com",834567,i1);
		Student s2 = new Student(3,"shreya","shreya@gmail.com",8369122,i2);
		
		s.show();
		s1.show();
		s2.show();
	}
}

