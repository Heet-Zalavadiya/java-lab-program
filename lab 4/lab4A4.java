import java.util.Scanner;
public class lab4A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        int length = s.length();
        System.out.println(length);
        for (int i = s.length()/2; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        sc.close();
    }
}
