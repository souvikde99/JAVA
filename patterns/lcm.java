import java.util.Scanner;
public class lcm {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int divisor = sc.nextInt();
            int divident = sc.nextInt();
            int k= divident*divisor;
            if (divisor<divident){
                int c =divident;
                divident=divisor;
                divisor=c;

            }
            while (divident%divisor!=0){
                int rem = divident % divisor;
                divident=divisor;
                divisor=rem;

            } 
            
            int  lcm= k/divisor;
            System.out.println( lcm);
            



    
}}
