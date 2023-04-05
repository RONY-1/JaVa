public class Employes {
    private String name;
    private int id;
    private double salary;

    public Employes(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id){
        this.id =id;
    }
    public void setSalary(double salary){
        this.salary =salary;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
}
