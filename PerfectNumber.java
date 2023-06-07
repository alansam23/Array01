import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        boolean b = isboolen(n);
        if (b)
            System.out.println("Is Perfect Number ");
        else
            System.out.println("Is Not Perfect Number ");
    }
        public static boolean isboolen ( int n){
            int sum = 0;
            for (int i=1;i<n;i++)
            {P
                if(n%i==0)
                    sum += i;
            }
            if(n==sum)
                return true;
            else
            return false;
        }
    }

