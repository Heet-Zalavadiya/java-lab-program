import java.util.Scanner;

public class Exection_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int[] b = new int[10];
        int size = 0;
        try {
            while (true) {
                b[size++] = 0;
            }
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("ArrayIndexOutOfBoundsException catched");
        }
        try {
            a = 2 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticExeception catched");
        }
        sc.close();
    }
}