package array;
import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
    
}
public static void selection_sort(int [] a) {
    for(int i=0;i<a.length;i++){
        int min_index=i;
        for(int j=i+1; j<a.length;j++){
            if(a[j]<a[min_index]){
                min_index=j;
            }
        }
        int t=a[i];
        a[i]=a[min_index];
        a[min_index]=t;
    }

    
}
}
