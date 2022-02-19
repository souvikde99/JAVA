import java.util.*;
public class pattern_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                int space=n-1;
                int star=n;
                for(int row=1;row<=(2*n)-1;row++){
                    for(int i=1; i<=space;i++){
                        System.out.print("  ");
                    } for(int j=1;j<=star;j++){
                        System.out.print("*"+" ");
                    }
                    if (row<n){space--; star--;} else{ space++;star++;}
                    System.out.println();
                }

    
}}
