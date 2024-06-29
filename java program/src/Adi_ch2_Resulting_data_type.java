import java.util.Scanner;
public class Adi_ch2_Resulting_data_type {
    public static void main(String[] args) {
        /*
        byte x=8;
        int y=20;
        short z=9;
        float a= 56.28f + y;
        int b= (x+y)*z;
        System.out.println(a);
        System.out.println(b);
      */
//        Increment And Decrement Operators.
      /*
        int a=10;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(++a);
     */

//        questin
       /*
        int y=7;
        int x= ++y*8; // ++precedence high hota hai * sa. Ans is: 64
        System.out.println(x);
        */
//        char ch='a';
//        System.out.println(ch);
//        System.out.println(++ch);


//        practice set
//queston 1
//        float a= 7/4.0f * 9/2.0f;
//        System.out.println(a);
//question 2
//        Encription form grade
//        char grade = 'B';
//        grade = (char)(grade + 8);
//        System.out.println(grade);

//        decription form the grade
//        grade = (char)(grade - 8);
//        System.out.println(grade);
//  question 3
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number is:");
//        int a =sc.nextInt();
//        System.out.println(a>8);
//question 4

        System.out.println("Enter the number V is:");
        int v= 5;
        System.out.println("Enter the number U is:");
        int u= 2;
        System.out.println("Enter the number a is:");
        int a= 2;
        System.out.println("Enter the number s is:");
        int s= 3;
        int sum =v*v-u*u/2*a*s;
        System.out.println(sum);
//question 5
        int x=7;
        int y=7*49/7 + 35/7;
        System.out.println(y);
    }
}
