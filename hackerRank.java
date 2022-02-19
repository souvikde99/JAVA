import java.util.*;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        String k = sc.nextLine();

        // ip
        int dec;
        if (sc1 != 10) {
            dec = toDec(k,8);
        } else {
            dec = Integer.parseInt(k);
        }
        // op
        String ans;
        if (sc2 == 2) {
            ans = binary(dec);
        } else if (sc2 == 8) {
            ans = octal(dec);
        } else if (sc2 == 16) {
            ans = hex(dec);
        } else {
            ans = Integer.toString(dec);
        }
        System.out.println(ans);

    }

    public static int toDec(String s, int t) {
        int k = Integer.parseInt(s, t);
        return k;
    }

    public static String octal(int n) {
        String k = Integer.toOctalString(n);
        return k;
    }

    public static String binary(int n) {
        String k = Integer.toBinaryString(n);
        return k;
    }

    public static String hex(int n) {
        String k = Integer.toHexString(n);
        return k;
    }

}