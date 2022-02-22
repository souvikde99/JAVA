package array;
import java.util.*;
public class insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
       sort(a);
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");}

}
public static void sort(int []a) 
{
    for(int i=1;i<a.length;i++){
        int j=i-1;
        int temp=a[i];
        while (j>=0 && a[j]>temp){
            a[j+1]=a[j];
            j--;

        } j++; a[j]=temp;
    }
    
}
}