//Calculator using Switch case
import java.util.Scanner;
public class Prac1_Cal {
    public void Cal(char a, double num1, double num2) { 
        double result = 0; // Declaration

        switch (a) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition is: " + result);
                break; 
            case '-':
                result = num1 - num2;
                System.out.println("Subtraction is: "  + result);
                break; 

            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is: " + result);
                break; 

            case '/':
                result = num1 / num2;
                System.out.println("Division is: " + result);
                break; 

            case '%':
                result = num1 % num2;
                System.out.println("Modulus is: " + result);
                break; 

            default:
                System.out.println("Invalid!!!"); 
        }
    }

    public static void main(String args[]) {
        Prac1_Cal obj = new Prac1_Cal(); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first number: ");
        double num1 = sc.nextDouble(); 
		System.out.println("Enter second number: ");
        double num2 = sc.nextDouble(); 

        System.out.println("Enter operator: +  -  *  /   %");
        char b = sc.next().charAt(0);

        obj.Cal(b, num1, num2); 

    }
}