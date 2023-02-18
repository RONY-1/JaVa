public class Overload {

    void add (int a,int b){
        System.out.println(a+b);
    }
    void add (double a,double b){
        System.out.println(a+b);
    }
    void add ( int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add (){
        System.out.println( " Nothing To Add ");
    }
    public static void main( String [] args){
        Overload obj = new Overload();
        obj.add();
        obj.add(200,300);
        obj.add(1.5,3.5);
        obj.add(3,5,7);

    }
}
