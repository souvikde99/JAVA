package new2;
import java.util.*;
import java.lang.Math;
public class uppercase_lowercase {
    public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    char n =  sc.next().charAt(0);
    int a=n;
    if (a>=97 && a<=122)
   { System.out.println("lowercase");}
    else if (a>=65 && a<=90) {System.out.println("UPPERCASE");}
    else {System.out.println("Invalid");}}
    
}
