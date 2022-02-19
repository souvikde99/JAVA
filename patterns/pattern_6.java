import java.util.Scanner;
import java.util.*;
public class pattern_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row = 0;
        int star=n;
        int spaces=0;
        while (row<=n){
        if (row==0){
            int i=1;
            while(i<=star){
                System.out.print("*"+" ");
                i++;
            }}
        else { int i =1;
            while (i<=spaces){
                System.out.print("    ");
                i++;
            } int j=1;
            while(j<=star){
                System.out.print("*"+" "); j++;
            }
        }row++;
        star--;
        spaces++;
        System.out.println();}
        }



    }




