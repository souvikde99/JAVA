import java.util.Scanner;
import java.util.*;
public class pattern_12 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();  
            int space = n-1;
            int star =1;
            int row = 1; 
            while (row<=n){
                for (int i=1; i<=space;i++){
                    System.out.print("  ");

                } for (int j=1; j<=star; j++){
                    if (j % 2==0){
                    System.out.print("*"+" ");} else { System.out.print("!"+" ");}
                }
             space--;
            star=star+2;
            row++;
            System.out.println();}
            
        } 
        
        }