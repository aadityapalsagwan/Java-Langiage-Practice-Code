public class Adi_ch7_Methods_Overloading {
    static void tellFelling(){
        System.out.println("I Love You P Dubey G. ");
    }
    static  void change(int [] arr){
         arr[0]=35;
    }

    static void foo(){
        System.out.println("ILU");
    }

    static  void foo(int a){
        System.out.println("I Love You " + a + " Dubey.");
    }

    public static void main(String[] args) {
        tellFelling();
        // change the array.
        int [] marks={52,78,98,65};
        change(marks);
        System.out.println("The value of marks[0] is  " + marks[0]);

//    Methods    OverLoading.......
        foo();
        foo(3000);

    }
}
