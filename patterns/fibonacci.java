import java.util.*;
public class fibonacci {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
    if (n==0){System.out.println(a);}
        else {for (int i=0;i<=n;i++){
            int c =a+b;
            b=a;
            a=c; 
            
        }}System.out.println(b);

    
}
}