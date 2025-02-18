public class Static {
    static int count = 0;

    public Static() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {

        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        Static.displayCount(); 
    }
}
