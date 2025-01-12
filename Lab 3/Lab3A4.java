import java.util.Scanner;
public class Lab3A4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter value of a:");
        int var1 = sc.nextInt();
        for (int i = 2; i < var1; i++) {
            if (var1%i==0) {
                System.out.println(var1 + " is not prime number");
                break;
            }
            else{
               flag=1;
            }
        }
        if (flag==1) {
            System.out.println(var1 + " is prime number");
        }
        sc.close();
    }
       
    

}
