import java.util.Scanner;
public class Lab1B5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of meter :   ");
		float a = sc.nextInt();
		double feet=(a*3.28084);
		System.out.println(feet);

		sc.close();
	}
}