package morseConverter;

import java.util.*;
import static morseConverter.MorseCodeConverter.englishAlphabets;
import static morseConverter.MorseCodeConverter.morseCode;

public class MorseCodeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to convert English to Morse code");
        System.out.println("Enter 2 to convert Morse code to English");
        int choice = input.nextInt();

        if (choice == 1) {
            Scanner ScEng = new Scanner(System.in);

            System.out.println("Enter the English text: ");
            String englishText = ScEng.nextLine().replaceAll(" ", "").toUpperCase();
           // System.out.println(englishText);
            System.out.println("Morse code: ");
            for (int i = 0; i < englishText.length(); i++) {
                System.out.print(englishAlphabets.get(String.valueOf(englishText.charAt(i))) + " ");
            }
        } else if (choice == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Morse code: ");
            String morseText = sc.nextLine();
            String[] morseCodeArray = morseText.split(" ");
            System.out.println("English text: ");
            for (String code : morseCodeArray) {
                System.out.print(morseCode.get(code));
            }
        } else {
            System.out.println("Invalid choice!");
        }

    }
}
