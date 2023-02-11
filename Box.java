public class Box {
    void display(double x,double y,double z)
    {
       System.out.println("Height:" + x + "\nWidth:" + y + "\nLength:" + z );

    }
    static double area(double x, double y){
        return x*y;

    }
    static double area (double x, double y, double z){
        return x*y*z;
    }
    public static void main(String[] args) {

        double x = 10.0, y = 20.0, z = 30.0;

        Box obj = new Box();

        obj.display(x,y,z);

        System.out.println("\nArea: " + area(x, y));

        System.out.println("\nVolume: " + area(x, y, z));

    }
    }



_______________________
OUTPUT:
_______________________
Height:10.0
Width:20.0
Length:30.0

Area: 200.0

Volume: 6000.0
______________








