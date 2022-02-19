package new2;
import java.util.*;
import java.lang.Math;
public class quad_game {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int k=((b*b)-(4*a*c));
        int d=(int) Math.sqrt(k);
        if(d<0){
            System.out.println("Imaginary");
        } else{
        
       
       
        if (d==0){
            System.out.println("Real and Equal");
            int q=((-b+d)/2*a);
            System.out.println(q+" "+q);
        }
        else if (d>0) {
            System.out.println("Real and Distinct");
            int q=((-b+d)/2*a); int w=((-b-d)/2*a);
            System.out.println(w+" "+q);

        }


    
}
}}