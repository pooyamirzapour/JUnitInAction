public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Hi this is IllegalArgumentException");
        }
        return Math.sqrt(x);
    }

    public double divide( double x, double y)
    {
        if (y==0){
            throw  new ArithmeticException("Hi this is ArithmeticException");
        }
        return x/y;
    }
}
