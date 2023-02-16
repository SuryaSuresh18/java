public class ProtectedExample extends Person{
	private String name1="Jasper";
	public static void main(String[] args) {
		ProtectedExample p = new ProtectedExample();
		System.out.println("Name: "+p.name);
		System.out.println("Phone no: "+p.numph);
		System.out.println("Friend Name: "+p.name1);
		//Calling getter and setter methods as it is in same package and public keyword used
		Hello h =new Hello();
		h.setId(1);
		h.setName("John");
		System.out.println(h.getId()+" "+h.getName());
	}

}
