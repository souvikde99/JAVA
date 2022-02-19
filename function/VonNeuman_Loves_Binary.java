package function;

import java.util.*;
public class VonNeuman_Loves_Binary {
    public static void main(String[] args){    
        String arr[];int k=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();sc.nextLine();
		arr=new String[n];
		for (int i=0;i<n;i++)
			arr[i]=sc.nextLine();
		
		for (int i=0;i<n;i++)
		{
		k=Integer.parseInt(arr[i],2);
		System.out.println(k);
		k=0;
		}


        
    
    }}