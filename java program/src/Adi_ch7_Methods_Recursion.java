import java.util.Scanner;

public class Adi_ch7_Methods_Recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_interative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product=1;
            for (int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of factorial is: ");
        int a= sc.nextInt();
        System.out.println("The value of factorial is " + factorial(a) );
        System.out.println("The value of factorial is " + factorial_interative(a) );

    }
}
