import java.util.*;
public class rhombus {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        int val=1;
        while(row<=2*n-1){
            //space
            int i=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int k=1;
            int p=val;
            while(k<=star){
                System.out.print(p+"\t");
                if(k<=star/2){p++;}else{p--;}
                k++;

            }
            if(row<n){star+=2;space--;val++;} else{star-=2;space++;val--;} row++;System.out.println();
        }
        
    
    
    
    }}