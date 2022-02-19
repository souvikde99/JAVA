import java.util.*;
public class pascal_triange {
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
		int row = 0;
		int str = 0;

		while (row < n) {

			int i = 0;
			int ncr = 1;
			while (i <= str) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			row++;
			str++;
			System.out.println();

		}

    
    
    
    
    
    }}