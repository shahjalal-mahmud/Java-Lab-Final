class Circle{
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
}

public class Problem01{
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Color: " + obj.getColor());

        Circle obj1 = new Circle(2.0);
        System.out.println("Radius: " + obj1.getRadius());
        System.out.println("Color: " + obj1.getColor());
    }
}