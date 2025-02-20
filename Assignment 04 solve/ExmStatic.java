public class ExmStatic {
    static class UseStatic{
        static public int a = 5;
        static void show(){
            System.err.println("Hello this is static.");
        }
    }
    class box{
        
    }
    public static void main(String[] args) {
        UseStatic obj = new UseStatic();
        obj.show();
    }
}
