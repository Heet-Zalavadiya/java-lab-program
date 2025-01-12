import java.util.Scanner;
public class Lab2A3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("Calculation of Area of Rectangle");
			System.out.println("Area = Length x Breath");
			System.out.println("Enter value of Length:");
			double l = sc.nextDouble();
			System.out.println("Enter value of Breath:");
			double b = sc.nextDouble();
			System.out.println("Area"+"="+(l*b));

			sc.close();
		
	}
}