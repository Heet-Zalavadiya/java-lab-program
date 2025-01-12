import java.util.Scanner;
public class Lab2B4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value fahrenheit: ");
		double f = sc.nextDouble();
		double c =((f - 32)*5/9);

		System.out.println("Celcius" + "=" + c);
		sc.close();
	}
}