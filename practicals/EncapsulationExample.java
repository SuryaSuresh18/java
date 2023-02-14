//Implementation of Java Bean
public class Student{
    //private data member
	private int sid;
	private String name;
	private String email;
	private long phoneno;
	
	//getter setter method
	public int getSid(){
	    return sid;
	}
	public void setSid(int sid){
	    this.sid=sid;
	}
	public String getName(){
	    return name;
	}
	public void setName(String name){
	    this.name=name;
	}
	public String getEmail(){
	    return email;
	}
	public void setEmail(String email){
	    this.email=email;
	}
	public long getPhone(){
	    return phoneno;
	}
	public void setPhone(long phoneno){
	    this.phoneno=phoneno;
	}
}
public class EncapsulationExample{
	public static void main(String args[]){
		Student s = new Student();//creation of student obj
		s.setSid(1001);//to set values of private member of student class
		s.setName("Surya");
		s.setEmail("surya@gmail.com");
		s.setPhone(12345678);
		System.out.println("Values are: "+s.getSid()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone());
	}
}