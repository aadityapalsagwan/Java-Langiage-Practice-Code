class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is: "+ id);
        System.out.println("My name is: "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Adi_ch8_OOPS_Custom_File {
    public static void main(String[] args) {
        Employee Aditya=new Employee(); // this is a object of a java class.(instantiating)

        //setting the attributes.
        Aditya.id=12;
        Aditya.salary=34;
        Aditya.name= "Aaditya Pal Sagwan";

        //Printing the attributes.
        Aditya.printDetails();
        int salary= Aditya.getSalary();
        System.out.println("The salary of Aditya is: "+salary);
//        System.out.println(Aditya.id);
//        System.out.println(Aditya.name);

    }
}
