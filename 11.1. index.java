import java.util.*;
class Main {
	static void row_wise_print(int[][]mat) {
		int N = mat.length;
		int M = mat[0].length;
		
		for(int i=0; i < N;i++) {
			for(int j=0; j < M;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	} 
	
	static void col_wise_print(int[][]mat) {
		int N = mat.length;
		int M = mat[0].length;
		
		for(int j=0; j < M;j++) {
			for(int i=0; i < N;i++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	} 
	
	static int[] minMax(int[]arr) {
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int[]ans = new int[2];
		ans[0] = min;
		ans[1] = max;
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[]arr = new int[n];
		for(int i=0; i < n;i++) {
			arr[i] = scn.nextInt();
		}
		
		int[]res = minMax(arr);
		System.out.println("Minimum of array : "+ res[0]);
		System.out.println("Maximum of array : " + res[1]);
		
		/*
		int N = scn.nextInt(); //rows
		int M = scn.nextInt(); //cols
		int[][]mat = new int[N][M];
		
		//take input in matrix
		for(int i=0; i < N;i++) {
			for(int j=0; j < M;j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		
		//row_wise_print(mat);
		col_wise_print(mat);
		*/
	}
}