import java.util.Scanner;
class IfElseSwitchExample{
	public static void main(String args[]){
		//int age=34;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age: ");
	    int age = sc.nextInt();
		if (age >=40 && age <= 65){
			System.out.println("Enter shift: ");
	    String shift = sc.next();
                //String shift="First";
			switch(shift){
				case "First":
				System.out.println("First shift allowed 6am - 3pm");
				break;
				
				case "Second":
				System.out.println("Second shift allowed 4pm - 10pm");
				break;
			}
		}else if (age>=20 && age<40){
			String shift1="General";
			switch(shift1){
				case "Night":
				System.out.println("Night shift allowed 11pm - 5am");
				break;
				
				case "General":
				System.out.println("General shift allowed 10am - 6pm");
				break;
			}
		}
		else{
			System.out.println("Age is not allowed");
		}
	}
}