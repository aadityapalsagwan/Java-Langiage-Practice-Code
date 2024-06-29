import java.util.Scanner;
public class Adi_ch5_loops_controls_instruction {
    public static void main(String[] args) {
    /*
        char i;
        System.out.printf("The Alphabets from A to Z are: \n");
        for (i = 'a'; i <= 'z'; i++) {
            System.out.printf("%c ", i);
        }
*/

//        while Loops
    /*
        int i=1;
        while(i<=200000){
            System.out.println("I Love U "+ i);
            i++;
        }
//     */

//      do-while loop
    /*
        int b=0;
          do{
              System.out.println(b);
              b++;
          }while(b<=10);

     */

//        for loop
        Scanner sc=new Scanner(System.in);
/*
        System.out.print("Enter the no. of table: ");
        int num= sc.nextInt();
        for (int i=1; i<=10; i++){
            System.out.printf(" %d X %d = %d " , num , i , num*i );
            System.out.println(" ");
        }
*/


//      star paturn

        System.out.print("Enter the number: ");
        int n= sc.nextInt();
       for (int i=n; i>0; i--){
           for (int j=0; j<i; j++){
               System.out.print("*" + " ");
           }
           System.out.print("\n");
       }



    }
}
