import java.util.*;
    public class pattern_5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int star=n;
            int spaces=0;
            int rows=0;
            while (rows<=n){ if(rows==0){
                int i=1;
                while (i<=star){
                    System.out.print("*"+" ");
                    i++;
                } } else {
                    int i=1;
                    while(i<=spaces){
                        System.out.print("  "); i++;
                    } int j=1;
                    while (j<=star ){
                        System.out.print("*"+" "); j++;
                    }

                }
            rows++;
            spaces++;
            star--;
            System.out.println();

            }
    
}}
