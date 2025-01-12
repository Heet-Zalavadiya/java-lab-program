import java.util.Scanner;
public class Lab3C7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting number of range: ");
        int a = sc.nextInt();
        System.out.println("Enter a ending number in rage: ");
        int b = sc.nextInt();

        int i=0;

        for ( i = a; i < b; i++) {
            if(i==0 || i==1){
                System.out.println(i + "is not prime number");
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    System.out.println(i + " is not prime number");
                    
                }
                else{
                    System.out.println(i + " is prime number");
                
                }
                
            }
        }
        sc.close();    
           
    
        
     }
    
}