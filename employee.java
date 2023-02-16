public class employee {
    int empid;
    String empname;
    employee (int id ,String name){
        this.empid=id;
        this.empname=name;
    }
    void info(){

    System.out.println("id:"+empid+"name:"+empname);

    }


    public static void main (String [] args){
        employee obj1= new employee( 4967 ,    "Rony");
        employee obj2= new employee(5919 ,    "Asif");
        obj1.info();
        obj2.info();


    }
}
