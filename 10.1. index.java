import java.util.*;
class Main {
	static boolean increasing_order(int[]arr,int k) {
		for(int i = 1; i < arr.length;i++) {
			if(arr[i-1] >= arr[i]) {
				return false;
			}
		}
		
		return true;	
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		/*
		int T = scn.nextInt();
		
		for(int k=1 ; k <= T;k++) {
			int N = scn.nextInt();
			int[]arr = new int[N];
			
			for(int i=0; i < N;i++) {
				arr[i] = scn.nextInt();
			}
			
			boolean inc = increasing_order(arr);
			
			if(inc == true) {
				System.out.println("Array is in increasing order");
			}
			else {
				System.out.println("Array is not in increasing order");
			}
		}
		*/
		
		
		ArrayList<Integer>al = new ArrayList<>(); 
		int N = scn.nextInt();
		
		//add N values to ArrayList
		for(int i = 1; i <= N;i++) {
			int val = scn.nextInt();
			al.add(val); 
		}
		
		//print ArrayList
		for(int i = 0; i < N;i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		//add 3 more values to the arraylist
		for(int i=1; i <= 3;i++) {
			int val = scn.nextInt();
			al.add(val);
		}
		
		// System.out.println(al);
		
		//print ArrayList
		for(int i = 0; i < al.size();i++) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
		
		//remove a value at an index 
		al.remove(4); //al.remove(index)
		
		System.out.println(al);
		
		//over-ride the value at index i with val
		al.set(3,19); //al.set(index,val)
		
		System.out.println(al);
		
		
	}
}