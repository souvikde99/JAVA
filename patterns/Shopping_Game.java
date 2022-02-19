import java.util.*;
public class Shopping_Game {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        for( int i=1; i<=n;i++){
            int i1=0;
       int i2=0;
       String k="";
            int a=  sc.nextInt();
            int b=  sc.nextInt();
        int sum1=0; 
        while (sum1<=a){ int ay = 1;
            i1++;
            sum1=sum1+ay;
            ay= ay+2;}
            int sum2=0; 
        while (sum2<=b){ int hr = 2;
            i2++;
            sum2=sum2+hr;
            hr= hr+2;}
            if (i1>i2) {k="Aayush";}
            else {k="Harshit";}
            System.out.println(k);
        
        }
        
       
        
    
}}

    

