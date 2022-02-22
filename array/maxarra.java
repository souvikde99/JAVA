package array;

import java.util.*;

public class maxarra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println(sumarea(a));

    }

    public static int sumarea(int[] hight) {
        int result=Integer.MIN_VALUE;
        int temp=1;
        for(int i=0;i<hight.length;i++){int l=1;
            for(int j=i+1;j<hight.length;j++){ 
                int k=Math.min(hight[i], hight[j]);
                // if(j==(hight.length-1)) {l--;}
                int result1=k*l;
                l++;
                result=Math.max(result, result1);

            }
        }
        return result;

    }
}
