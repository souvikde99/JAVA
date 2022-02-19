package new2;

import java.util.*;
import java.lang.Math;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        int mul = 1;
        while (n > 0) {
            int rem = (int) (n % 10);
            if (rem >= 5) {
                int t = 9 - rem;
                ans = ans + t * mul;
            } else {
                ans = ans + mul * rem;
            }
            n /= 10;
            mul = mul * 10;
        }
        // if (ans==9 || ans<5){ans=ans+mul*n;} else {int t= (int) (9-n);
        // ans=ans+t*mul;}
        System.out.println(ans);

    }
}
