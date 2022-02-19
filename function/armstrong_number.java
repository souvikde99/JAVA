package function;

import java.util.*;
import java.lang.Math;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNo(n));
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

    public static boolean armstrongNo(int n) {
        int d = countOfDigit(n);
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, d));
            n /= 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }

    }
}
