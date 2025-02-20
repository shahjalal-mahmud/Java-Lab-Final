class Box{
    private int a = 10;
    public int b = 20;
    protected int c = 30;

    //Getter method
    public int getA(){
        return a;
    }

    // Setter method
    public void setA(int n){
        a = n;
    }
}

public class AccessControl {
    public static void main(String[] args) {
        Box obj = new Box();
        System.out.println("a = " + obj.getA());
        obj.setA(100);
        System.out.println("a = " + obj.getA());
        
        System.out.println("b = " + obj.b);
        System.out.println("c = " + obj.c);
    }
}
