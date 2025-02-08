import java.util.Scanner;

public class Lab4A3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter value in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j=(arr.length)-1; j>=0;j--){
           System.out.println("Reverse Array");
           System.out.println(arr[j]);
        }
        sc.close();
    }
}
