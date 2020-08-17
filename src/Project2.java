import java.util.Random;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        boolean game = true;
        while(game) {
            Random rand = new Random();
            int computer = rand.nextInt(6);
            Scanner scan = new Scanner(System.in);

            System.out.println("Odds and Evens Game! ");
            System.out.print("Hello! What's your name?");
            String name = scan.nextLine();
            System.out.print("Hi " + name + ", would you like play (O)dds or (E)vens?");
            String gameValue = scan.nextLine();
            if (gameValue.equals("O")) {
                System.out.println(name + " picked odds! The computer will be evens.");
            } else if (gameValue.equals("E")) {
                System.out.println(name + " picked evens! The computer will be odds.");
            } else {
                System.out.println("Sorry, you picked wrong letter!");
            }
            System.out.println("----------------------");

            System.out.print("How many fingers do you put out?");
            String num = scan.nextLine();
            int number = Integer.parseInt(num);
            System.out.println("Computer plays " + computer);
            System.out.println("----------------------");
            int sum = computer + number;
            System.out.println("The sum is " + sum);
            if (sum % 2 == 0) {
                if (gameValue.equals("E")) {
                    System.out.println("Great! You win!");
                } else {
                    System.out.println("Sorry, computer wins.");
                }
            } else {
                if (gameValue.equals("O")) {
                    System.out.println("Great! You win!");
                } else {
                    System.out.println("Sorry, computer wins.");
                }
            }
            System.out.println("----------------------------");
            System.out.print("Would you like to play again?(y/n) ");
            String ifPlay = scan.nextLine();
            if (ifPlay.equals("n")){
                game = false;
            }
        }
    }
}

