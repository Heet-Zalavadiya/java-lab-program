
import java.util.Scanner;
public class Lab4A1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet :");
        String s = sc.nextLine();
        int vowel=0;
        int consonent=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'|| ch=='A'|| ch=='e' || ch=='E' || ch=='i'|| ch=='I'|| ch=='o'|| ch=='O' || ch=='u' || ch=='U') {
                vowel++;
            }
            else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) {
                consonent++;
            }

        }
        System.out.println(vowel + " are vowels");
        System.out.println(consonent + " are consonent");
        sc.close();
    }
}
