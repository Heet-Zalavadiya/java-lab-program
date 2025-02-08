import java.util.Scanner;
public class Lab4A2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int sum=0;
        int avg=0;
        int count=0;
        System.out.println("Enter value in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            count ++;
            sum=sum+arr[i];
        }
        avg=sum/count;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
        sc.close();
    }
  


    
}
