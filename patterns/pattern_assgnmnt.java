import java.util.Scanner;
import java.util.*;
public class pattern_assgnmnt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
       for(int i=1; i<=rows;i++){
           for (int j=1;j<=i;j++){
               if (i==1 || i==2){
                   System.out.print(i+"\t");
               }  else { if (j==1 || j==i) { System.err.print(i+"\t");} else {System.out.print("0"+"\t");}}
           } System.out.println();
       }
       



}}