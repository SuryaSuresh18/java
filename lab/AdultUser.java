package My;

public class AdultUser implements LibraryUser {//child class(AdultUser) implements interface LibraryUser

	@Override
	public void registerAccount(int age) {//Method implemented
		if(age>12)
			System.out.println("You have successfully registered under an Adult Account");
		else
			System.out.println("Sorry, age must be greater than 12 to register as an adult");
	}

	@Override
	public void requestBook(String bookType) {//Method implemented
		if(bookType=="Fiction")
			System.out.println("Book Issued successfully, please return within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}

}
