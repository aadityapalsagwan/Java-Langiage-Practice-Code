abstract class Base1{
    public Base1(){
        System.out.println("Mai Base1 ka constructor hu.");
    }
    public void sayhello(){
        System.out.println("Hello Adi");
    }
    abstract public void greet();
}
class Child2 extends Base1{
    @Override
    public void greet() {
        System.out.println("Good Morning Adi Sir!");
    }
}

public class Abstract_Class_Ch_11_53 {
    public static void main(String[] args) {
     Child2 c = new Child2();
    }
}
