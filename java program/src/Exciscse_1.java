import java.util.Scanner;
public class Exciscse_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subject1 marks is: ");
        int subject1 = sc.nextInt();
//        float subject1 = sc.nextFloat();
        System.out.print("Enter the subject2 marks is: ");
        int subject2 = sc.nextInt();
//        float subject2 = sc.nextFloat();
        System.out.print("Enter the subject3 marks is: ");
        int subject3 = sc.nextInt();
//        float subject3 = sc.nextFloat();
        System.out.print("Enter the subject4 marks is: ");
        int subject4 = sc.nextInt();
//        float subject4 = sc.nextFloat();
        System.out.print("Enter the subject5 marks is: ");
        int subject5 = sc.nextInt();
//        float subject5 = sc.nextFloat();
        float percentage = (subject1 + subject2 + subject3 + subject4 + subject5)/5f;
        System.out.print("The total percentage is: ");
        System.out.println(percentage +"%");
//        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5)/50f;
//        System.out.print("The total cgpa is: ");
//        System.out.println(cgpa);
    }
}
