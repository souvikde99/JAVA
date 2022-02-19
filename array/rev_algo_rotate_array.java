package array;
import java.util.*;
public class rev_algo_rotate_array {
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
public static void rotate(int a[],int k) {
    k=k%a.length;
    int n=a.length;
    reverse(a, 0, n-k-1);//frst n-k elmnt
    reverse(a, n-k, n-1);//last k elmnt
    reverse(a, 0, n-1);//rev whole arr

    
    
}
 public static void reverse(int[] a,int i,int j) {
        
        while (i < j) {
            int temp=a[i]; 
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
}
}