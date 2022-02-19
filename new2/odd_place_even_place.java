package new2;
import java.util.*;
public class odd_place_even_place {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=1;
        int odd=0;
        int even=0;
        while(a>0){
            
            int rem=a%10;
            if (count%2==0){
                even+=rem;
            }else{odd+=rem;}
            a/=10;
            
            count++;
        }
        System.out.println(odd);
        System.out.println(even);
}}
