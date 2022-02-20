package array;

import java.util.*;

public class PairofRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int price = sc.nextInt();
            totalPrice(n, a, price);

        }
    }

    public static void totalPrice(int n, int a[], int price) {
        int k = -1;
        int l = -1;
        int temp=Integer.MAX_VALUE;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (price == a[i] + a[j]) {
                    // int temp = 10;
                    int diff = Math.abs(a[i] - a[j]);

                    if (diff < temp) {
                        k = a[i];
                        l = a[j];
                    }
                    temp = diff;

                }
            }
        }
        if (k <= l) {
            System.out.println("Deepak should buy roses whose prices are " + k + " and " + l + ".");
        } else {
            System.out.println("Deepak should buy roses whose prices are " + l + " and " + k + ".");
        }
    }

}