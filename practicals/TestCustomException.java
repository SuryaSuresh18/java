package my;

public class TestCustomException {
	//method to check exception
	static void checkAge(int age) throws VerificationException{
		if(age<18 || age>25){
			throw new VerificationException("Student age should be 18-25 for admission");
		}
		else{
			System.out.println("Student is eligible for admission");
		}
	}
	public static void main(String[] args) {
		try{
			checkAge(15);
		}catch(VerificationException e){
			System.out.println(e);
		}

	}

}
