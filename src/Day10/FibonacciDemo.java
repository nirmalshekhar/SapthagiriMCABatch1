package Day10;
public class FibonacciDemo {
    static int fib(int n) {
        System.out.println("Calling fib(" + n + ")");
        if (n == 0) {
            System.out.println("Returning 0 from fib(" + n + ")");
            return 0;
        }
        if (n == 1) {
            System.out.println("Returning 1 from fib(" + n + ")");
            return 1;
        }
        int result = fib(n - 1) + fib(n - 2);
        System.out.println("Returning " + result + " from fib(" + n + ")");
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println("Final Result: " + result);
    }
}
