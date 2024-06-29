class empy{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name=n;
    }
}

class cellphone{
    public void vibrate(){
        System.out.println("Vibrating    ");
    }

    public void ring(){
        System.out.println("Ringing........");
    }
}

class Square{
      int side;
      public int area(){
          return side*side;
      }

      public  int parameter(){
          return 4*side;
      }

}

  class Tommy{
      public void hiting(){
          System.out.println("Lath mar");
      }
      public void run(){
          System.out.println("Nikal chutiya");
      }

      public void fire(){
          System.out.println("Sr fod sala ka");
      }
  }


public class Adi_ch8_OOPS_Practice_set {
    public static void main(String[] args) {
    /*
        //problem 1;
        empy Adi=new empy();
        Adi.setName("Aaditya");
        System.out.println(Adi.getName());
        Adi.salary = 25;
        System.out.println(Adi.getSalary());


        //problem 2;
        cellphone Infinix=new cellphone();
        Infinix.vibrate();
        Infinix.ring();


        //problem 3;

        Square sq=new Square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.parameter());
    */

        //problem 5;
        Tommy to=new Tommy();
        to.fire();
        to.run();
        to.hiting();



    }
}
