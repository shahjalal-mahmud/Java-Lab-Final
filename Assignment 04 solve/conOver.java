public class conOver {

    static class Box{
        double h;
        double w;
        double l;
        public Box(double  a, double b, double c){
            h = a;
            w = b;
            l = c;
        }
        public Box(){
            h = 0;
            w = 0;
            l = 0;
        }
        public Box(double a){
            l = a;
            w = a;
            h = a;
        }
    }
    public static void main(String[] args) {
        Box obj = new Box(5, 10, 15);
        System.err.println("l: " + obj.l + "w: "+ obj.w + "h: " + obj.h);
    }
}
