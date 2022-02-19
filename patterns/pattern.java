import java.util.Scanner;
public class pattern {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n/2;
		int row = 1;
		while(row <= n) {
			// space
			int i = 1;
			while(i <= space) {
				System.out.print("\t");
				i = i + 1;
			}
			
			// star
			int j = 1;
			while(j <= star) {
				System.out.print("*\t");
				j = j + 1;
			}
			
			// next row 
			// mirror
			if(row < n/2 + 1) {
				star = star + 2;
				space = space - 1;
			} else {
				star = star - 2;
				space = space + 1; 
			}
				row = row + 1;
				System.out.println();
		}}}
    
    
    
    
    
    
    