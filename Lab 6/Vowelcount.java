import java.util.Scanner;

class vowel_count {
    public void CountVowel(String sen) {
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        for (int i = 0; i < sen.length(); i++) {
            if (sen.toLowerCase().charAt(i) == 'a') {
                countA++;
            }
            if (sen.toLowerCase().charAt(i) == 'e') {
                countE++;
            }
            if (sen.toLowerCase().charAt(i) == 'i') {
                countI++;
            }
            if (sen.toLowerCase().charAt(i) == 'o') {
                countO++;
            }
            if (sen.toLowerCase().charAt(i) == 'u') {
                countU++;
            }
        }
        System.out.println("Input Sentence = " + sen);
        System.out.println("no.of vowel A is " + countA);
        System.out.println("no.of vowel E is " + countE);
        System.out.println("no.of vowel I is " + countI);
        System.out.println("no.of vowel O is " + countO);
        System.out.println("no.of vowel U is " + countU);

    }

}

public class Vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vowel_count vc = new vowel_count();
        while (true) {
            System.out.println("Enter a sentance: ");
            String sen = sc.nextLine();
            if (sen.equals("quite")) {
                break;
            }
            vc.CountVowel(sen);
        }
        sc.close();
    }
}
