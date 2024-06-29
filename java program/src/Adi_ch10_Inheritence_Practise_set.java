class Circle{
    public int radius;
    Circle(){
        System.out.println("I am Circle non parameter: ");

    }
    Circle(int r){
        System.out.println("I am Circle parameter  constructor is: ");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle {
    public int height;

    Cylinder1(int r , int h){
       super(r);
        System.out.println("I am Cylinder parameter  constructor is: ");

        this.height = h;
    }

    public double volume() {
      return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Adi_ch10_Inheritence_Practise_set {
    public static void main(String[] args) {

        // Problem 1.
//        Circle objc = new Circle(12);
        Cylinder1 obj = new Cylinder1(1,3);
       double x =  obj.volume();
        System.out.println(x);
    }
}
