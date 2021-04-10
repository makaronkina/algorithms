package lesson5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(reFact(5));
        System.out.println(fib(10));
        System.out.println(reFib(10));
        System.out.println(triangleNum(14));
        System.out.println(reTriangleNum(14));
        System.out.println(multiply(10, 15));
        System.out.println(reMultiply(10, 15));

    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int reFact(int n) {
        if(n == 1) {
            return 1;
        } return reFact(n-1) * n;
    }

    public static long fib(long n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long reFib(long n) {
        if (n < 3) {
            return 1;
        }
        return reFib(n - 1) + reFib(n - 2);
    }

    public static long triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long reTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return reTriangleNum(n -1) + n;
    }

    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }

    public static int reMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return reMultiply(a,b - 1) + a;
    }
}
