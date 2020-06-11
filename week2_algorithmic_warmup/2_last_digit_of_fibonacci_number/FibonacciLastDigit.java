import java.util.*;

public class FibonacciLastDigit {
    
      
    private static long calc_fib(long n) {
        long a[] = new long[(int) (n) + 1];
        a[0] = 0;
        if (n > 0) {
            a[1] = 1;
            int i;
            for (i = 2; i < n + 1; i++) {
                a[i] = a[i - 1]%10 + a[i - 2]%10;
            }
        }
        return a[(int) n];

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = calc_fib(n);
        System.out.println(c%10);
    }
}

