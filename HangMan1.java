
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HangMan1 {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static String[] words = {"KOPYTKO", "ELEWACJA", "ESTETYCZNY", "EKSTREMALNY"};
    public static String word = words[random.nextInt(words.length)];
    public static char[] wword = word.toCharArray();
    public static int lifes = 0;
    public static char[] hw;
    public static void main(String[] args) {

        String hidenWord = "";
        for (int i = 0; i < word.length(); i++) {
            hidenWord = hidenWord + "*";
        }
        hw = hidenWord.toCharArray();

        while (lifes < 7 && Arrays.toString(hw).contains("*")) {

            System.out.println("ENTER LETTER: ");
            char letter = scanner.next().charAt(0);
            game(letter);
            System.out.println(hw);
        }
        scanner.close();
    }
    public static void game(char letter) {

        boolean LetterGuessed = false;
        for (int i = 0; i < word.length(); i++) {
            if (wword[i] == letter) {
                hw[i] = letter;
                LetterGuessed = true;
            }
        }
        if (!LetterGuessed){
            lifes++;
            hangmanImage();
        }
        if (Arrays.equals(hw, wword)) {
            System.out.println("YOU WIN, WORD: ");
        }
    }
    public static void hangmanImage() {
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




