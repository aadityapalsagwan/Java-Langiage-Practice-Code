class Myemployee{
   private int id;
 private String name;

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

public class Adi_ch9_Access_Modifier {
    public static void main(String[] args) {
        Myemployee myempy=new Myemployee();
        myempy.setId(34);
        System.out.println(myempy.getId());
        myempy.setName("Adi Pal");
        System.out.println(myempy.getName());


    }
}
