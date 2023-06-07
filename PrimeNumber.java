import java.lang.Math;
import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value");
        int n = sc.nextInt();
        boolean isPrime = true;
        System.out.println("The Prime Numbers are ");
        for (i = 2; i <=n; i++) {
            int sqrt = (int) Math.sqrt(i);
            for (j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(" " + i + " ");
            isPrime = true;
        }
    }
}