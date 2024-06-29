class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.print("I am base X is:  ");
        this.x = x;
    }

    public void printme(){
        System.out.println("I am a constuctor");
    }
}

class Derived extends  Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.print("I am base Y is:  ");
        this.y = y;
    }
}

public class Adi_ch10_Inheritence {
    public static void main(String[] args) {
    // Create a object a Base class.
        Base b=new Base();
        b.setX(1);
        System.out.println(b.getX());
        b.printme();

    //     Create a object a Derived class.

        Derived d=new Derived();
        d.setY(12);
        System.out.println(d.getY());
        d.setX(2);
        System.out.println(d.getX());

    }
}
