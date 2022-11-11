import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = 7;
		int[]arr = new int[N];
		
		//to take input
		for(int i=0; i < N;i++) {
			arr[i] = scn.nextInt();
		}
		
		int total_runs = 0;
		for(int i=0; i < N;i++) {
			total_runs += arr[i];
		}
		
		// int avg = total_runs / N;
		// System.out.println(avg);
		
		int hs = 0; //highest score
		for(int i=0; i < N;i++) {
			if(arr[i] > hs) {
				hs = arr[i];
			}
		}
		
		System.out.println(hs);
		
	}
}