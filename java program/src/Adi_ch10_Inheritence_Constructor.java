class Mybase{
    Mybase(){
        System.out.println("I am Mybase Constructor.");
    }

    Mybase(int a){
        System.out.println("I am overloaded Mybase Constructor the value of A is: "+ a);
    }
}

class Derived1 extends Mybase{
   Derived1(){
//       super(12);
       System.out.println("I am a derived1 class constructor");
   }

    Derived1(int a,int b){
       super(a);
        System.out.println("I am overloaded Derived1 Constructor the value of B is: "+ b);
    }
}

class childofderived extends  Derived1{
    childofderived(){
        System.out.println("I am child of derived Constructor. ");
    }

    childofderived(int a, int b, int c){
        super(a,b);
        System.out.println("I am overloaded Derived1 Constructor the value of C is: "+ c);

    }
}

public class Adi_ch10_Inheritence_Constructor {
    public static void main(String[] args) {

    // create a MyBase object.
//      Mybase Myb=new Mybase();


    // create a derived1 object.
//       Derived1 d=new Derived1();
//        Derived1 d=new Derived1(12,36);

        // create a Child of derived object.

//        childofderived cd=new childofderived();
        childofderived cd=new childofderived(12,4,54 );


    }
}
