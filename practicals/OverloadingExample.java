//Example of overloading(same method name parameter different)
class Calc_Area
{
	//Calculate area of circle
	public double area(double r)//Area of cirlce
	{
		return(3.14*r*r);
	}
	//Calculate area of rectangle
	public double area(double l,double b)//Area of rectangle
	{
		return(l*b);
	}
	//Calculate area of trapezium
	public double area(double s1,double s2,double h)//Area of trapezium
	{
		return(0.5*(s1+s2)*h);
	}
}
class OverloadingExample{
	public static void main(String args[])
	{
		Calc_Area ca = new Calc_Area();
		System.out.println("Area of circle : "+ca.area(3.5));
		System.out.println("Area of circle : "+ca.area(6.7,5.5));
		System.out.println("Area of circle : "+ca.area(6.8,5.5,9.7));
	}
}