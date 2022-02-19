package array;
import java.util.*;
public class PairofRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int price=sc.nextInt();
        totalPrice(n,a,price);
    
}}
public static void totalPrice(int n,int a[],int price) {
    int k=0;int l=0;
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            
            if (price==a[i]+a[j]){
                int temp=10;
                int mindiff=Math.abs(a[i]-a[j]);
                
                if(mindiff<=temp){
                        k=a[i];l=a[j];
                }temp=mindiff;

            
            }
        }
        }if(k<=l){System.out.println("Deepak should buy roses whose prices are "+k+" and "+l);}
        else{System.out.println("Deepak should buy roses whose prices are "+l+" and "+k);}
} 

}