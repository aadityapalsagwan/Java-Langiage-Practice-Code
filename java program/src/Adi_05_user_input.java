import java.util.Scanner;
public class Adi_05_user_input {
    public static void main(String[] args) {
        System.out.println("input taking the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the num1 is:");
//        int a=sc.nextInt();
//        System.out.println("Enter the num2 is:");
//        int b=sc.nextInt();
//        System.out.println("Enter the num3 is:");
//        int c=sc.nextInt();
//        int sum = (a + b )* c;
//        System.out.print("The sum of three no. is: ");
//
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

//        String str = sc.next(); // read a single word.
        String str = sc.nextLine(); // read a full sentence or paragraph.
        System.out.println(str);

    }
}
