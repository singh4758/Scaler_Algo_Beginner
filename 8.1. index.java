import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		//assume n>=r
		//int n = scn.nextInt();
		// int r = scn.nextInt();
		
		// int fact1 = factorial(n); //fact1 -> n!
		// int fact2 = factorial(n-r); //fact2 -> (n-r)!
		// int fact3 = factorial(r); //fact3 -> r!
		
		// int ans = fact1 / (fact2 * fact3); //ans -> nCr
		// System.out.println(ans);
		
		// boolean val = EvenOrOdd(n);
		// //true -> n is even, false -> n is odd 
		// System.out.println(val);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int gcd = GCD(a,b);
		System.out.println(gcd);
		
	}
	
	static int minimum(int a,int b) {
		if(a < b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	static int GCD(int a,int b) {
		if(a == 0) {
			return b;
		}
		else if(b == 0) {
			return a;
		}
		
		int min = minimum(a,b);
		
		for(int i = min; i >= 1;i--) {
			if(a % i == 0 && b % i == 0) {
				return i;
			}
		}
		
		return 1; 
	}
	
	
	//given, return true is n is even else false
	static boolean EvenOrOdd(int x) {
		if(x % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	//given n, returns n!
	static int factorial(int n) {
		int fact = 1;
		
		for(int i=1; i <= n;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	////given n, print n!
	// static void factorial(int n) {
	// 	int fact = 1;
		
	// 	for(int i=1; i <= n;i++) {
	// 		fact = fact * i;
	// 	}
		
	// 	System.out.println(fact);
		
	// }
	
	
}