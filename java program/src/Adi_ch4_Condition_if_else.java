import java.util.Scanner;
public class Adi_ch4_Condition_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        if-else statement
     /*
        System.out.print("Enter your age: ");
        int age =sc.nextInt();
        System.out.println("logical operator AND: ");
        if (age>18){
            System.out.println("YOU CAN DRIVE Car.");
        }
        else{
            System.out.println("YOU CAN'T DRIVE Car.");
        }
     */

//       logical operators
        boolean a=true;
        boolean b=false;
      /*
        if(a && b){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
     */
//        System.out.println("logical operator OR: ");
//        if(a || b){
//            System.out.println("Y");
//        }
//        else {
//            System.out.println("N");
//        }
//

//        if-else-if-else condition
      /*
        System.out.print("Enter your age:");
        int c= sc.nextInt();
        if(c>40){
            System.out.println("you are expert in driving.");
        }
        else if (c>30){
            System.out.println("you are experience in driving.");
        }
        else if (c > 20) {
            System.out.println("you can drive");
        } else{
            System.out.println("you can't drive.");
        }
        */

//        switch case start
     /*
        System.out.print("Enter your age:");
        int c= sc.nextInt();
        switch (c){
            case 18:
                System.out.println("U R Adult");
                break;
            case  25:
                System.out.println("U R going to JoB and enjoy yr life.");
                break;
            case  30:
                System.out.println(" U  get merried.");
                break;
            default:
                System.out.println("u  get retired.");


    }

      */
        //        practice set

//        Q2
    /*
        byte m1, m2 ,m3;
        System.out.println("Enter the Physics marks is: ");
        m1= sc.nextByte();

        System.out.println("Enter the Chemistry marks is: ");
        m2= sc.nextByte();

        System.out.println("Enter the Maths marks is: ");
        m3= sc.nextByte();
        float avg=(m1 + m2 + m3 )/3.0f;
        if (avg>=33 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Pass.");
        }
        else{
            System.out.println("Fail.");
        }
     */
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
    }
}
