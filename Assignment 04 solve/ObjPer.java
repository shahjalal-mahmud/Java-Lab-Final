public class ObjPer {
    static class Test{
        public int a, b;
        public Test(int a, int b){
            this.a = a;
            this.b = b;
        }
        boolean Check(Test o){
            if (o.a == a && o.b ==b) {
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Test obj1 = new Test(5, 10);
        Test obj2 = new Test(5, 10);
        System.err.println(obj1.Check(obj2));
    }
}
