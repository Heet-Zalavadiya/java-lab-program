import java.util.Scanner;
public class Lab2C5{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a:");
	int a = sc.nextInt();
	System.out.println("Enter value of b:");
	int b = sc.nextInt();
	System.out.println("Enter value of c:");
	int c = sc.nextInt();

	int largest = a>b?(a>c?a:c):(b>c?b:c);
	System.out.println("Largest Element among three is " + largest);
	sc.close();
 }
	


}