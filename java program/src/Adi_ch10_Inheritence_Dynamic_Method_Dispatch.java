class Phone{
    public void name(){
        System.out.println("My name is java in class One.");
    }
}

class Smartphone extends Phone{
    public void name(){
        System.out.println("My name is java in class Two.");
    }
}

public class Adi_ch10_Inheritence_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
 /*
    // create a one object in java.
        Phone a=new Phone();
//        a.name();

    // create a Two object in java class.
       Smartphone  b=new Smartphone();
       b.name();
*/

        Phone obj=new Smartphone();
        obj.name();
    }
}
