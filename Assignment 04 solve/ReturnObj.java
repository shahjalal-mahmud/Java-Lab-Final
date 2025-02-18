public class ReturnObj {
    static class Test{
        public int a;
        public Test(int a){
            this.a = a;
        }
        Test meth(){
            Test temp = new Test(a+5);
            return temp;
        }
    }
    public static void main(String[] args) {
        Test obj = new Test(10);
        Test ob2;
        ob2 = obj.meth(); // ob2 = temp
        System.err.println("a = " + ob2.a);
        System.err.println("a = " + obj.a);
    }
}
