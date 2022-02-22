package array;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        bubble_sort(a);
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");}

    
}
public static void bubble_sort(int [] a) {
    for(int pass=1;pass<a.length;pass++){
        for(int i=0;i<a.length-pass;i++){
            if( a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
            }

        }
    }

    
}
}
