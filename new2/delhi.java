package new2;
import java.util.*;
public class delhi {   
     public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        int sum=0;
        // int odd=0;
        // int even=0;
        while(t-->0){int a=sc.nextInt();
            while(a>0){
            int rem=a%10;
            sum+=rem;
            a/=10;


        } if(sum%2==0) {if (sum%4==0)
        {System.out.println("Yes");}else{System.out.println("No");}} 
        else {if(sum%3==0)
            {System.out.println("Yes");}
            else{System.out.println("No");}}

}}}
