package array;
import java.util.*;
public class targetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int k=sc.nextInt();
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int price=sc.nextInt();
        totalPrice(n,a,price);
    
}
public static void totalPrice(int n,int a[],int price) {
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if (price==a[i]+a[j])
            if(a[i]<=a[j]){System.out.println(a[i]+" and "+a[j]);}
            else{{System.out.println(a[j]+" and "+a[i]);}}


            } 
        }
    }
}
