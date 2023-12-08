import java.util.*;
public class guess {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("----****----!!!!####_____Welcome to Number Guessing Game____####----");
        System.out.println("You have to guess Number between 1-100.\nAnd you have only 10 chances");
        System.out.println("You can quit game by entering negative number");
        int i = 1, guessNo, score = 1100;
        for (i = 1; i <= 10; i++) {
            System.out.print("Guess Number:");
            guessNo = sc.nextInt();
            if (guessNo < 0) {
                System.out.println("You quitted the game");
                break;
            } else if (guessNo > number)
                System.out.println("Your Number Is Too Large");
            else if (guessNo < number)
                System.out.println("Your Number Too Small");
            else {
                System.out.println("You Guessed It Right");
                System.out.println("You Scored " + (score - (100 * i) + "in" + i + " attempts"));
                break;
            }
        }
        if (i == 11)
            System.out.println("Sorry you lost the Game\nThe number was " + number + "\n Better Luck next time");
        System.out.println("Thanks for playing game");
    }

}