package My;

public class KidUsers implements LibraryUser {//child class(KidUsers) implements interface LibraryUser

	@Override
	public void registerAccount(int age) {//Method implemented
		if (age<12)
			System.out.println("You have successfully registered as a kid");
		else
			System.out.println("Sorry , Age must be less than 12 to register as a kid");
	}

	public void requestBook(String bookType) {//Method implemented
		if(bookType=="Kids")
			System.out.println("Book issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books");
	}
	

}
