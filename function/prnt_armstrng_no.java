package function;

import java.util.*;
import java.lang.Math;

public class prnt_armstrng_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            armstrongNo(i);
        }
        sc.close();

    }

    public static int countOfDigit(int n) {
        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;

    }

    public static void armstrongNo(int n) {
        int d = countOfDigit(n);
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, d));
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp);
        }

    }

}
