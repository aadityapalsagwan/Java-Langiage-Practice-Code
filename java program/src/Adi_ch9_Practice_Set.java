
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int i){
        radius=i;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int i){
        height=i;
    }

    public int getHeight(){
        return height;
    }
}

public class Adi_ch9_Practice_Set {
    public static void main(String[] args) {

    //problem 1;
        Cylinder cy=new Cylinder(9,12);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());

    // problem 2;
    }
}
