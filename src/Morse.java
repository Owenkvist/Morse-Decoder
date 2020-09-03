import java.util.HashMap;

public class Morse {
    public static void main(String[] args) {
        HashMap<String, String> morseCode = new HashMap<String, String>();

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
        morseCode.put(".----", "1");
        morseCode.put("..---", "2");
        morseCode.put("...--", "3");
        morseCode.put("....-", "4");
        morseCode.put(".....", "5");
        morseCode.put("-....", "6");
        morseCode.put("--...", "7");
        morseCode.put("---..", "8");
        morseCode.put("----.", "9");
        morseCode.put("-----", "0");
        morseCode.put("--..--", ",");
        morseCode.put(".-.-.-", ".");
        morseCode.put("..--..", "?");
        morseCode.put("−−··−−", "!");
        morseCode.put("···−−−···", "SOS");


        translateMorse(morseCode,
                ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. −−··−− / ···−−−···");

    }

    public static void translateMorse(HashMap<String, String> morseCode, String theMorse) {
        String splitToWord[] = theMorse.split(" / ");

        for (int i = 0; i < splitToWord.length; i++) {
            String splitToLetter[] = splitToWord[i].split(" ");

            for (int j = 0; j < splitToLetter.length; j++) {
                System.out.print(morseCode.get(splitToLetter[j]));

            }
            System.out.print(" ");
        }

    }

}