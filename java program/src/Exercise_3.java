import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noofGuess=0;
    public int getNoofGuess() {
        return noofGuess;
    }

    public void setNoofGuess(int noofGuess) {
        this.noofGuess = noofGuess;
    }

    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserInput(){
        System.out.print("Guess the Number is: ");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }

    boolean iscorrectNumber(){
        noofGuess++;
        if (inputNumber==number){
            System.out.format("Yes , You guess the right number is: %d \n  You guess the no is %d attempt", number , noofGuess);
            return true;
        } else if (inputNumber<number) {
            System.out.println("Ab number chota hai...");
        } else if (inputNumber>number) {
            System.out.println("number bada hai..");
        }

        return false;
    }



}

public class Exercise_3 {
    public static void main(String[] args) {
        /*
           create a class game, which allow a user to play "Guess the number"
           game once. Game should have the following methods.

           1. Constructor to generate the random number.
           2. takeuserInput() to take a user input of number.
           3. isCorrectnumber() to detect wether the number entered by the user is true.
           4. getter and setter for the number of Guess.

           Note:-Use properties such as noofGuess(int),etc to get this task done.
          */

        Game g=new Game();
        boolean b= false;
        while(!b){
            g.takeuserInput();
            b= g.iscorrectNumber();
            System.out.println(b);
        }
    }
}
