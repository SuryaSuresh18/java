package My;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {//Main class
		KidUsers k = new KidUsers();//Object of KidUser class 
		k.registerAccount(10);//Methods of KidUser called using instance
		k.registerAccount(18);
		k.requestBook("Kids");
		k.requestBook("Fiction");
		AdultUser d = new AdultUser();//Object of AdultUser class 
		d.registerAccount(5);//Methods of AdultUser called using instance
		d.registerAccount(23);
		d.requestBook("Kids");
		d.requestBook("Fiction");

	}

}
