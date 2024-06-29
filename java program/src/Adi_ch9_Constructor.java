class MyMainemployee{
    private int id;
    private String name;

    public MyMainemployee(){
        id=12;
        name="Here Name";
    }

    public MyMainemployee(String myname,int myid){
        id=myid;
        name=myname;
    }

    public void setId(int i){
        id=i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name=n;
    }

    public  String getName(){
        return name;
    }

}


public class Adi_ch9_Constructor {
    public static void main(String[] args) {
        MyMainemployee Me=new MyMainemployee("Aditya",120);
        MyMainemployee Mme=new MyMainemployee();
//        Mme.setId(1);
//        Mme.setName("Ap");
        System.out.println(Me.getId());
        System.out.println(Me.getName());
        System.out.println(Mme.getId());
        System.out.println(Mme.getName());
    }
}
