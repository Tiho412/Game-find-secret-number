
import java.util.Scanner;

public class GameFindSecretNumber {
    public static void main(String[] args){
        final int MAX_NUMBER=100;
        final int MIN_NUMBER=1;
        int range=MAX_NUMBER-MIN_NUMBER;
        int secretNumber=(int)(Math.random()*range+MIN_NUMBER);
        Scanner sc=new Scanner(System.in);
        int yourNumber=0;
        int score=0;
        while(yourNumber!=secretNumber) {
            System.out.println("Input your number");
            yourNumber = sc.nextInt();
            if (yourNumber > secretNumber) {
                System.out.println("greater than secret number");
            } else if (yourNumber < secretNumber) {
                System.out.println("less thanber secret number");
            } else {
                System.out.println("successful");
            }
            score++;
        }
        System.out.println("Score="+score);

}}




