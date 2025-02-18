public class CallByV {
    static class Test{
        int i, j;
        public Test(int a, int b){
            i = a;
            j = b;
        }
        void meth(int a, int b){
            i = i/ 2;
            j = j/2;
        }
        void meth(Test o){
            o.i /=2;
            o.j /=2;
        }
        
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        Test obj = new Test(a ,b);
        System.out.println("Before call: a = " + a + " b = " + b);
        obj.meth(a, b);
        System.out.println("After call: a = " + a + " b = " + b);

        System.out.println("Before call: a = " + obj.i + " b = " + obj.j);
        obj.meth(obj);
        System.out.println("After call: a = " + obj.i + " b = " + obj.j);

    }
}
