import java.util.Scanner;
import java.util.*;
public class pattern_25 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();int m=1;
    for (int i=1; i<=rows; i++){
        
        for (int j=rows; j>i; j--){
            System.out.print("\t");
        }
        for (int k=1; k<=(2*i)-1;k++){
            System.out.print(m+"\t");
            m++;
        }
        System.out.println();
        


    }







scanner.close();
}}