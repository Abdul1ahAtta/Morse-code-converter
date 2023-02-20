package morseConverter;

import java.util.HashMap;

public class MorseCodeConverter {

    static HashMap<String, String> morseCode = new HashMap<String, String>();
    static HashMap<String, String> englishAlphabets = new HashMap<String, String>();


    static {
        morseCode.put(".-", "A");
        morseCode.put("-...", "B");
        morseCode.put("-.-.", "C");
        morseCode.put("-..", "D");
        morseCode.put(".", "E");
        morseCode.put("..-.", "F");
        morseCode.put("--.", "G");
        morseCode.put("....", "H");
        morseCode.put("..", "I");
        morseCode.put(".---", "J");
        morseCode.put("-.-", "K");
        morseCode.put(".-..", "L");
        morseCode.put("--", "M");
        morseCode.put("-.", "N");
        morseCode.put("---", "O");
        morseCode.put(".--.", "P");
        morseCode.put("--.-", "Q");
        morseCode.put(".-.", "R");
        morseCode.put("...", "S");
        morseCode.put("-", "T");
        morseCode.put("..-", "U");
        morseCode.put("...-", "V");
        morseCode.put(".--", "W");
        morseCode.put("-..-", "X");
        morseCode.put("-.--", "Y");
        morseCode.put("--..", "Z");
        morseCode.put(":", " ");


        englishAlphabets.put(" ", " ");
        englishAlphabets.put("A", ".-");
        englishAlphabets.put("B", "-...");
        englishAlphabets.put("C", "-.-.");
        englishAlphabets.put("D", "-..");
        englishAlphabets.put("E", ".");
        englishAlphabets.put("F", "..-.");
        englishAlphabets.put("G", "--.");
        englishAlphabets.put("H", "....");
        englishAlphabets.put("I", "..");
        englishAlphabets.put("J", ".---");
        englishAlphabets.put("K", "-.");
        englishAlphabets.put("L", ".-..");
        englishAlphabets.put("M", "--");
        englishAlphabets.put("N", "-.");
        englishAlphabets.put("O", "---");
        englishAlphabets.put("P", ".--.");
        englishAlphabets.put("Q", "--.-");
        englishAlphabets.put("R", ".-.");
        englishAlphabets.put("S", "...");
        englishAlphabets.put("T", "-");
        englishAlphabets.put("U", "..-");
        englishAlphabets.put("V", "...-");
        englishAlphabets.put("W", ".--");
        englishAlphabets.put("X", "-..-");
        englishAlphabets.put("Y", "-.--");
        englishAlphabets.put("z", "--..");


    }


    public String decode(String code) {
        return ".-";
    }

    public String morseHello(String hello) {
        return "Hello";
    }

    public String morsetest(String hW) {
        return "Hello world";
    }
}