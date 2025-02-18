
public class MethodOverloading {

    double Area(){
        return 0;
    }
    double Area(int a) {
        return (3.14 * a * a);
    }

    double Area(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.err.println("Circle ARea: " + obj.Area(5));
        System.err.println("Rec ARea: " + obj.Area(5, 10));
        System.err.println("Rec ARea: " + obj.Area());

    }
}
