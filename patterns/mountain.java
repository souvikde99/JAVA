import java.util.*;
public class mountain {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n+1;
        int row=1;
        while(row<=n){ 
            //star
            int i=1;
            while(i<=star){
            System.out.print(i+"\t");
            i++;}
            //spc
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            //star
            i--;
            
            int k=1;
            if(row==n){i--;k++;}
            while(k<=star){
                System.out.print(i+"\t");i--;
            k++;
            }




            System.out.println();row++; star++;space-=2;


           
    }
   
            

}}