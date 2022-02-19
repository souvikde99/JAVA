package array;
import java.util.*;
public class Inverse_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int item=sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int b[]=new int [n];
        // int a []={1, 2, 3,4};
        reverse(a,b);
        for (int i=0;i<a.length;i++)
        {System.out.print(b[i]+" ");}
    }

    public static void reverse(int a[],int b[]) {
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            b[temp]=i;


        }
        

        
    }
}
