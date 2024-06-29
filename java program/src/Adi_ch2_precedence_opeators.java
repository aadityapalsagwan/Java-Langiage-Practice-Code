public class Adi_ch2_precedence_opeators {
    public static void main(String[] args) {
//        precedence & Associtavity(Left to Right)
        int a = 40*2-50/5; //Associtavity(Left to Right).
        /*
           = 80-50/5
           = 80-10
           = 70
         */
        System.out.println(a);
        int b=40/2-5*5; //Associtavity(Left to Right).
        /*
          = 20-5*5
          = 20-25
          = -5
        */
        System.out.println(b);
    }
}
