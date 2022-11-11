import java.util.*;
class Main {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		////2nd question
		// for(int i=1; i <= N;i++) {
		// 	int k = 1;
		// 	for(int j=1; j <= i;j++) {
		// 		if(j % 2 == 1) {
		// 			System.out.print("*");
		// 		}
		// 		else {
		// 			System.out.print(k);
		// 			k++;
		// 		}
		// 	}
		// 	System.out.println();
		// }
		
		
		//above part of diamond
		for(int i=1; i <= N;i++) {
			//stars (left side)
			for(int j=1; j <= N-i+1;j++) {
				System.out.print("*");
			}
			
			//spaces
			for(int j=1; j <= 2*(i-1);j++) {
				System.out.print(" ");
			}
			
			//stars (right side)
			for(int j=1; j <= N-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		//below part of diamond
		for(int i=1; i <= N;i++) {
			//stars (left side)
			for(int j=1; j <= i;j++) {
				System.out.print("*");
			}
			
			//spaces
			for(int j=1; j <= 2*(N-i);j++) {
				System.out.print(" ");
			}
			
			//stars (right side)
			for(int j=1; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}