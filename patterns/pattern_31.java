import java.util.Scanner;
import java.util.*;
public class pattern_31 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    
    for (int i=1; i<=rows; i++){ 
        for(int k=rows;k>=1;k--)
            {
        if (k==i){ System.out.print("*"+" ");} else { System.out.print(k+" ");}
        }
            
            
        System.out.println();}
       

            }}       
        