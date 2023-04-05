import javax.naming.Name;

public class MyClass {
    public static void main (String args []) {
        Employes obj = new Employes ("only",221, 200.20);
        obj.setName("akibul");
        obj.setId(221);
        obj.setSalary(2000.2000);
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getSalary());

    }
}
