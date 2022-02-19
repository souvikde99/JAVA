package new2;
import java.util.*;
public class ferTOcel {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int fer1 = sc.nextInt();
        int fer2 = sc.nextInt();
        int r = sc.nextInt();
        
        for (int i=fer1;i<=fer2;i=i+r){
            float c=5.0F/9.0F;
            int k=(int)(c*(i-32));
            System.out.println(i+"\t"+k); 
        }

        
    
}}

    

