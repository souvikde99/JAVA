package array;
import java.util.*;
public class mindtreeQs {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i <n; i++) {
                a[i] = sc.nextInt();
            }
            triplet_add(a);
    
}
public static void triplet_add(int [] a ) {
    int k;
    for (int i=0;i<a.length;i++){
        k=a[i]+a[i+1]+a[i+2];
        if (k%3==0){
            System.out.println("{"+a[i]+","+a[i+1]+","+a[i+2]+"}");
            
        }
    }





}



}
