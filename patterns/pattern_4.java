import java.util.*;
public class pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int star=1;
        int space =n-1;
        int row=1;
        while(row<=n){ 
            int i =1;
            while(i<=space){
                System.out.print("   ");
                i++;
            } int j=1;
            while (j<=star){
                System.out.print("*"+"  ");
                j++;
            }

                

             // next row prep
            row++;
            space--;
            star++;
            System.out.println();
        } sc.close();}
         




        
    }

