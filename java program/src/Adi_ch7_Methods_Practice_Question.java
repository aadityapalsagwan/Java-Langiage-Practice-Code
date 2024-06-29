public class Adi_ch7_Methods_Practice_Question {
    static void multiplaction(int x){
        for (int i=1; i<=10; i++){
            System.out.printf(" %d X %d = %d " , x , i , x*i );
            System.out.println(" ");
        }
    }

    static void star_pattern(int y){
        for (int i=0; i<y; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }

    static void star_pattern1(int y){
        for (int i=y; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }

    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n* sumRec(n-1);
    }

    static int fib(int n){
        if (n==1 || n==2) {
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[]args) {
        //problem 1;
//        multiplaction(2);
        //problem 2
//        star_pattern(5);

        //problem 3;
//        int c = sumRec(3);
//        System.out.println(c);

        //problem 4;
//        star_pattern1(4);

        //problem 5;
//        fibonacci series
        int result = fib(7);
        System.out.println(result);
    }
}
