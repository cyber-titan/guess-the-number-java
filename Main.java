import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randNumber = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Guess The Number Game!!!");
        System.out.println("Numbers Will Be In The Range 1 to 100 (inclusive)");
        System.out.println("To QUIT Enter A Negative Number");
        int attempt = 0;
        do{
            System.out.println("Guess My Number:");
            int userInput = sc.nextInt();
            attempt++;
            if(userInput < 0){
//              if user wants to QUIT
                System.out.println("Well Tried.\nMy Number Was: " + randNumber);
                break;
            } else if (randNumber == userInput) {
                System.out.println("Correct Guess! Congratulations!\nMy Number Was: " + randNumber);
//              When correct guess, print total guesses
                System.out.println("Total Guesses Taken: " + attempt);
                break;
            } else if (userInput > randNumber) {
                System.out.println("Your Number Is Too Large!");
            } else if (userInput < randNumber) {
                System.out.println("Your Number Is Too Small!");
            }
        }while(true);
    }
}
