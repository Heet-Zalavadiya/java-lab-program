import java.util.Scanner;
public class Lab1C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = sc.next();

        if (input.length() == 1) {
            char letter = input.charAt(0);

            letter = Character.toLowerCase(letter); // Convert to lowercase to handle both uppercase and lowercase letters

            // Use == to compare char with char
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a Vowel");
            }
            // Check if it's a consonant
            else if (letter >= 'a' && letter <= 'z') {
                System.out.println(letter + " is a Consonant");
            } else {
                System.out.println("Invalid input. Please enter a valid input");
            }
        } else {
            System.out.println("Please enter a single character");
        }

        sc.close();
    }
}
