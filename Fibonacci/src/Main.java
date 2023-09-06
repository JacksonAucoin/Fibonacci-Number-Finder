import java.util.Scanner;

public class Main
{
    public static long[] fibonacciStorage;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What number of the Fibonacci sequence are you looking for? -> ");
        int n = s.nextInt();
        fibonacciStorage = new long[n+1];
        fibonacci(n);
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        if (fibonacciStorage[n] != 0)
        {
            return fibonacciStorage[n];
        }
            long nthFibonacciNum = fibonacci(n-1)+fibonacci(n-2);
        fibonacciStorage[n] = nthFibonacciNum;
            return nthFibonacciNum;
    }
}