package function;

import java.util.*;

import java.lang.Math;

public class allconv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        int k = sc.nextInt();

        int dec = binaryToDecimal(k, sc1);

        if (sc2 == 2) {
            System.out.println(Integer.toBinaryString(dec));
        } else if (sc2 == 10) {
            System.out.println(dec);
        } else if (sc2 == 8) {
            System.out.println(Integer.toOctalString(dec));
        } else {
            System.out.println(Integer.toHexString(dec));
        }
        sc.close();

    }

    static int binaryToDecimal(int n, int sc1) {
        int num = n;
        int dec_value = 0;
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * sc1;
        }

        return dec_value;
    }

}
