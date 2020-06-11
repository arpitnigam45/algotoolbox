import java.util.Scanner;

public class Fibonacci {
  
 private static long calc_fib(long n) {
    long a[] = new long[(int) (n)+1];
   a[0] = 0;
   if(n>0){
   a[1] = 1;
   int i;
   for (i = 2; i < n+1; i++) {
     a[i] = a[i - 1] + a[i - 2];
   }}
   return a[(int)n];

 }
  

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();

    System.out.println(calc_fib(n));
  }
}
