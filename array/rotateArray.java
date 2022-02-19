package array;

import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(a, k);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;

        for (int l = 0; l < k; l++) {
            int temp = a[a.length - 1];
            for (int i = a.length - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
        }

    }

}
