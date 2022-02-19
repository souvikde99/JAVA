import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    for (int i=rows; i>=1; i--)
    {
       
        for (int k=1; k<=(i * 2) -1; k++) 
        { 
            System.out.print("*"+" "); 
        } 
        System.out.println(); 
         
        for (int j=rows; j>=i; j--)
        {
            System.out.print("  ");
        }
    }
    scanner.close();











}}