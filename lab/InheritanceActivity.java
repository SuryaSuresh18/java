class Employee{//Parent class
//Instance obj
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance=250.80;
    double Hra=1000.50;
    Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone)//Parametrized  constructor employee
    {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.employeeAddress=employeeAddress;
	this.employeePhone=employeePhone;
    }
    public double calculateSalary(){//Method to calculate salary
		double salary= basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		return salary;
		
	}
    public void calculateTransportAllowance(){//Method to calculate Transport Allowance
		double transportAllowance=(0.1*basicSalary);
	}
}
class Manager extends Employee{//Sub class of Employee
    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {//Parametrized  constructor manager
        super(employeeId, employeeName, employeeAddress, employeePhone);// to call  parent obj
        this.employeeId=employeeId;
		this.employeeName=employeeName;
	    this.employeeAddress=employeeAddress;
	    this.employeePhone=employeePhone;
        this.basicSalary=basicSalary;
    }
    public void calculateTransportAllowance(){// To calculate Transport Allowance of Manager
		double transportAllowance=(0.15*basicSalary);
		System.out.println("Travel Allowance of Manager: " +transportAllowance);
		}
}
class Trainee extends Employee{//Child class of Employee
    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {//Parametrized  constructor trainee
        super(employeeId, employeeName, employeeAddress, employeePhone);// to call parent obj
        this.employeeId=employeeId;
	    this.employeeName=employeeName;
	    this.employeeAddress=employeeAddress;
	    this.employeePhone=employeePhone;
        this.basicSalary=basicSalary;
    }
    public void calculateTransportAllowance(){// To calculate Transport Allowance of Trainee
		double transportAllowance=(0.1*basicSalary);
		System.out.println("Travel Allowance of Trainee: " +transportAllowance);
	}
}
public class InheritanceActivity {
    public static void main(String[] args) {
        Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);//Manager class obj created
        System.out.println("Salary of Manager: "+m.calculateSalary());//method called
        m.calculateTransportAllowance();//method called
        Trainee t =new Trainee(29846,"Jack","Mumbai India",442085,45000);//Trainee class obj created
        System.out.println("Salary of Trainee: "+t.calculateSalary());//method called
        t.calculateTransportAllowance();//method called
    }
}
