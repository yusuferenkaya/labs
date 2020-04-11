import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in); //Creates an object to read user input
        Random rand = new Random(); //Creates an object from Random class
        int number = rand.nextInt(100); //generates a number between 0 and 99



        System.out.println("Hi! I'm thinking of a number between 0 and 99.");
        System.out.print("Can you guess it: ");

        int guess = reader.nextInt(); //Read the user input
        int numberOfTries = 0;

        while(guess != -1 && guess != number){

            System.out.println("Sorry");

            numberOfTries++;

            if (guess > number) {

                System.out.println("Mine is lower than your guess");
            }
            else{
                System.out.println("Mine is higher than your guess");
            }
            System.out.println("Type -1 to quit or guess another");
            guess = reader.nextInt();

            if (guess == number) {

                System.out.println("Congratulations!");
                System.out.println("You've found it in " + numberOfTries + " attempts");
            }
            else{
                System.out.println("Sorry the number was " + number);
            }







        }


        reader.close(); //Close the resource before exiting





    }
}
