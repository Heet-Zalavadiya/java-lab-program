import java.util.Scanner;

public class Lab3A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int var1 = sc.nextInt();
        System.out.println("Enter value of b:");
        int var2 = sc.nextInt();
        System.out.println("Enter value of c:");
        int var3 = sc.nextInt();
        int var5 = var1 > var2 ? (var1 > var3 ? var1 : var3) : (var2 > var3 ? var2 : var3);
        System.out.println("Largest Element among three is " + var5);

        sc.close();
    }

}

