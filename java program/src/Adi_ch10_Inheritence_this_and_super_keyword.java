class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}

public class Adi_ch10_Inheritence_this_and_super_keyword {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(10);
        System.out.println(e.getA());
        System.out.println(e.returnone());
    }
}
