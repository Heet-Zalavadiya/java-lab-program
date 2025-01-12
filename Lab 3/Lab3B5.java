import java.util.Scanner;
public class Lab3B5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any year:   ");
		int year = sc.nextInt();

		while (year<0) {
			System.out.println("Enter valid number:");
			year = sc.nextInt();
		}

		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + " Year is leap year");
		}

		else{
			System.out.println(year + " Year is not Leap year");
		}
		sc.close();
	}
}