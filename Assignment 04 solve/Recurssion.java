public class Recurssion {
    public double Factorial(int a){
        if (a <= 1) {
            return 1; // Base case
        }
        else{
            return a * Factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int a = 4;
        Recurssion obj = new Recurssion();
        System.err.println(obj.Factorial(a));
    }
}
// 4! = 4 * 3 * 2 * 1
// 5! = 5 * 4 * 3 * 2 * 1

// 4!
// 4 * 3!
// 4 * 3 * 2!
// 4 * 3 * 2 * 1!
// 4 * 3 * 2 * 1