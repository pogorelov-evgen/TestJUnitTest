public class MyMath {
    public static double divide(int x, int y) {
        if (y==0) throw new ArithmeticException("Division by zero");
        return x*1.0/y;
    }
}
