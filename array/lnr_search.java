package array;
import java.util.*;
public class lnr_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int item=sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(lnr_srch(a, item));

    
}
public static int lnr_srch(long [] a, int item) {
    for(int i=0;i<a.length;i++){if(a[i]==item){return i;}
}
    return -1;
        
    
    
}
}
