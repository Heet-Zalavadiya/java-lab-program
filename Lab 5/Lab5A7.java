import java.util.Scanner;
public class Lab5A7{
	public static void main(String[] args){
		int[] a = {0,1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println(" ");

		System.out.println("Enter value of pivot: ");
		int pivot = sc.nextInt();
         for (int j=pivot;j<a.length;j++ ) {
              int[] b = a[j];
         }
		for (int k=0;k<=pivot;k++) {
			int[] b = a[k];
		}
        for (int l=0;l<=b.length;l++ ) {
        	System.out.println(b[l]);
        }
		
	}
}