package array;
import java.util.*;
public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int l=0;l<k;l++){
            int p=sc.nextInt();
            int j= sc.nextInt();
            int fact=0;
            for (int q=0;q<a.length;q++){
                if(a[q]%p==0){
                    fact++;
                }
                
            }if (fact>=j){
                System.out.println("Yes");
            
            } else{System.out.println("No");}
    
        }
       
}


}
