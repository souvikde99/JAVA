package new2;
import java.util.*;
import java.lang.Math;
public class test {public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    long n= sc.nextLong();
    if (n==0){System.out.println("5");}
    long sum=0;
    for(int i=0;n>0;i++){
        long rem=n%10;
        if (rem==0){rem=5;}
        sum=(long)(sum+rem*(Math.pow(10,i)));
        n/=10;

    } System.out.println(sum);
}
}
