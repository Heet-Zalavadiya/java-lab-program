import java.util.Scanner;
public class Lab3B6{
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number:  ");
       int a = sc.nextInt();

       int num=a;
       int reverse=0;

       while(a!=0){
        int digit = a%10;
        reverse = reverse*10+digit;
        a=a/10;
       }
       if (num==reverse){
           System.out.println(num + "numberpalidrom");
       }
       	
       sc.close();
       
	}
}