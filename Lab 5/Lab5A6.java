import java.util.Scanner;
public class Lab5A6{
	public static void main(String[] args){
		int n = 3;
		for (int i=0;i<n;i++ ) {
			for (int k=0;k<n-1-i;k++ ) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=n-2;i>=0;i--){
			for (int k=0;k<n-1-i;k++ ) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}