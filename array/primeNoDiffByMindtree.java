package array;
import java.util.*;
public class primeNoDiffByMindtree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int result=diff(a);
        System.out.println(result);

}
public static int diff(int a []) {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int b [];
    for (int i=0;i<a.length;i++){
        if(isprime(a[i])){
            max=Math.max(max, a[i]);
            min=Math.min(min, a[i]);
           
        }


    }
    System.out.println(min );
    int dif=max-min;
    return dif;
    
    
}
public static boolean isprime(int n) {
    int fact=0;
    if (n==1) {return false;}
    for(int i=2;i<n;i++){
        if (n%i==0){
            fact++;
        }

    }
    if(fact>0){return false;} else{return true;}
    

    
}
}
