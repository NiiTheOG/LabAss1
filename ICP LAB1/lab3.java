import java.util.Scanner;

public class lab3 {

	double pi=3.14;
	
	//method to calculate the area with a given radius
	public double area(double radius) {
		return pi*(radius*radius);
		
	}
	
	//method to calculate the circumference with a given radius
	public double circum(double radius) {
		return 2*pi*radius;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the radius");
	double radius=scanner.nextDouble();
	lab3 calc= new lab3();
	
	double result= calc.area(radius);
	double result1=calc.circum(radius);
			
	System.out.println(result);
	System.out.println(result1);
	
	}

}
