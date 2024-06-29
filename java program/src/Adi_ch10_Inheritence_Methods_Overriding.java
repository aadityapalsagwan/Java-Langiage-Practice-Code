class  A{
    int a;
    public int Adi(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am mehod 2 of class A is here.");
    }
}

class B extends A{

    public void meth2(){
        System.out.println("I am mehod 2 of class A is here.");
    }
    public void meth3(){
        System.out.println("I am mehod 3 of class B is here.");
    }
}

public class Adi_ch10_Inheritence_Methods_Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        System.out.println(a.Adi());

        B b=new B();
        b.meth3();
        b.meth2();
        System.out.println(b.Adi());
        b.meth2();

    }
}
