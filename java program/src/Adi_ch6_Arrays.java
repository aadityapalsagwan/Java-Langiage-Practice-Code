//import java.util.Scanner;
public class Adi_ch6_Arrays {
    public static void main(String[] args) {
//        500 student details enter in the arrays.
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the the marks ");
//        int[] marks =  new int[sc.nextInt()];
//         int[]marks={100,65,45,96,75};
//
 /*
         int [] marks = new int[5];

         marks[0] = 100;
        marks[1] = 25;
        marks[2] = 65;
        marks[3] =63;
        marks[4] = 95;
        System.out.println(marks[0]);
*/

//        ---------------------------for each loop in arrays-----------------

       int[]marks={100,65,45,96,75};
//        System.out.println(marks[2]);
        System.out.print("Enter the Array length is ");
        System.out.println(marks.length);
/*
        float[]mark={90.1f ,75.2f ,65.7f , 56.3f ,85.2f};
        System.out.println(mark[2]);

        String[]student= {"Aditya", "Dubey G", "Parth"};
        System.out.println(student[1]);
*/

//        display the array with the help of for loops
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

//        reverce order

        for (int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }



    }
}
