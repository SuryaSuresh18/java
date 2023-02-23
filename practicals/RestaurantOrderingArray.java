import java.util.Scanner;
public class RestaurantOrderingArray {
	public void starter(){
		String a[]=new String []{"Samosa","Paneer Tikka","Sabudana","Bread roll"};
		System.out.println("Select the starters from the Menu:");
		System.out.println("1:Samosa\n2:Paneer Tikka\n3:Sabudana\n4:Bread rolls");
		System.out.println("Enter your choice:");
		Scanner sc =new Scanner(System.in);
		
			int num=sc.nextInt();
			switch(num){
		    case 1:
		    	System.out.println(a[0]);
			    break;
		    case 2:
			    System.out.println(a[1]);
			    break;
		    case 3:
			    System.out.println(a[2]);
			    break;
		    case 4:
			    System.out.println(a[3]);
			    break;
		    
		    default:
			    System.out.println("Invalid choice!!!");
			}
		}		
	
	public void mainCourse(){
		String a[]=new String []{"Fried Rice","Noddles","Masala Dosa","Dal Rice"};
		System.out.println("Select the Main Course from the Menu:");
		System.out.println("1:Fried Rice\n2:Noddles\n3:Masala Dosa\n4:Dal Rice");
		System.out.println("Enter your choice:");
		Scanner sc =new Scanner(System.in);
	
			int num=sc.nextInt();
			switch(num){
		    case 1:
		    	System.out.println(a[0]);
			    break;
		    case 2:
			    System.out.println(a[1]);
			    break;
		    case 3:
			    System.out.println(a[2]);
			    break;
		    case 4:
			    System.out.println(a[3]);
			    break;
		    
		    default:
			    System.out.println("Invalid choice!!!");
			}
		}		
	
	public void beverages(){
		String a[]=new String []{"Tea","Coffee","Milk","Green Tea"};
		System.out.println("Select the beverages from the Menu:");
		System.out.println("1:Tea\n2:Coffee\n3:Milk\n4:Green Tea");
		System.out.println("Enter your choice:");
		Scanner sc =new Scanner(System.in);
			int num=sc.nextInt();
			switch(num){
		    case 1:
		    	System.out.println(a[0]);
			    break;
		    case 2:
			    System.out.println(a[1]);
			    break;
		    case 3:
			    System.out.println(a[2]);
			    break;
		    case 4:
			    System.out.println(a[3]);
			    break;
		    default:
			    System.out.println("Invalid choice!!!");
			}
			//return num;
		}		
	

	public static void main(String[] args) {
		RestaurantOrderingArray ra = new RestaurantOrderingArray();
		ra.starter();
		ra.mainCourse();
		ra.beverages();
		System.out.println("Your order : ");
		
	}
}
