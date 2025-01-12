import java.util.Scanner;
public class Scannerclass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println(a);
		System.out.println(str);
		sc.close();


	}
}