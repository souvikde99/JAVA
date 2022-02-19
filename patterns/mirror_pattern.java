import java.util.Scanner;
import java.util.*;
public class mirror_pattern {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();  
            int star=1;
            for (int row =1;row<=(2*n)-1;row ++){
                for(int i=1; i<= star; i++){
                    System.out.print("*"+" ");
                }       
            if (row<n){star++;} else{star--;}
            System.out.println(); } 


    }}