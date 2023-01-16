import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangMan {
     static int lifes = 0;
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] words = {"KOPYTKO", "ELEWACJA", "ESTETYCZNY", "EKSTREMALNY"};
        String word = words[random.nextInt(words.length)];
        char[] wword = word.toCharArray();
        char[] hw;


        String hidenWord = "";
        for (int i = 0; i < word.length(); i++) {
            hidenWord = hidenWord + "*";
        }
        hw = hidenWord.toCharArray();
        while (7 > lifes && Arrays.toString(hw).contains("*")) {
            System.out.println(lifes);

            System.out.println("ENTER LETTER: ");
            char letter = scanner.next().charAt(0);
            game(letter, word, wword, hw, lifes);
            System.out.println(hw);
        }
        scanner.close();
    }

    public static void game(char letter, String word, char[] wword, char[] hw, int lifes) {

        boolean LetterGuessed = false;
        for (int i = 0; i < word.length(); i++) {
            if (wword[i] == letter) {
                hw[i] = letter;
                LetterGuessed = true;
            }
        }
        if (!LetterGuessed) {
            lifes++;
            hangmanImage(word, lifes);
        }
        if (Arrays.equals(hw, wword)) {
            System.out.println("YOU WIN, WORD: ");
        }
    }
    public static void hangmanImage(String word, int lifes) {
        if (lifes == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (lifes == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (lifes == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (lifes == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (lifes == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (lifes == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (lifes == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}


