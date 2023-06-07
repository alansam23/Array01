import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        long[] ser = new long[n];
        ser[0] = 0;
        ser[1] = 1;
        for( int i =2; i<n;i++) {
            ser[i] = ser[i - 1] + ser[i - 2];
        }
        System.out.println(Arrays.toString(ser));
    }

}