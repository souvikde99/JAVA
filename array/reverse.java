package array;

import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int item=sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // int a []={1, 2, 3,4};
        reverse(a);
        for (int i=0;i<a.length;i++)
        {System.out.print(a[i]+" ");}
    }

    public static void reverse(int[] a) {
        int i=0;
        int j=a.length-1;
        while (i < j) {
            int temp=a[i]; 
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
System.out.println();
    }

}
