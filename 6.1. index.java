import java.util.*;
class Main {
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		//Square pattern of N*N stars
		
		/*
		for(int i=1; i <= N;i++) {
			for(int j=1; j <= N;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//Given N = 4, print the following pattern
		/*
		****
		***
		**
		*
		*/
		
		// for(int i=1; i <= N;i++) {
		// 	for(int j=1; j <= N-i+1;j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		// for(int i=1; i <= N;i++) {
		// 	//j -> [i,N] = N-i+1
		// 	for(int j=i; j <= N;j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		
		//Given n = 4, print - 
		
		// *   *
		// *  *
		// * *
		// **
		
		
		for(int i = 1; i <= N;i++) {
			System.out.print("*");
			
			for(int j = 1; j <= N-i;j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println();
			
		}
		
		
	}
}