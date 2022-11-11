import java.lang.*;
import java.util.*; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // int i;
        
        // System.out.println("ODD");
        // for(i = 1;i <= n; i++) {
        //     if (i%2 != 0) {
        //         System.out.println(i);
        //     }
        // }
        
        // System.out.println("EVEN");
        // for(i = 1;i <= n; i++) {
        //     if (i%2 == 0) {
        //         System.out.println(i);
        //     }
        // }
        
        // N -- > [1, N]
        
        // for (int i = 1; i <= n; i++) {
        //     if(n%i == 0) {
        //         System.out.println(i);
        //     }
        // }
        
        // Count of factors for a given number N
        
        // 8:23
        
        // 20
        /*
        1 --> 20%1==0 -- 1
        2 --> 20%2==0 -- 2
        3 --> 20%3!=0 -- 2
        4 --> 20%4==0 -- 3
        .........
        */
        
        // int ans = 0;
        // for (int i = 1; i <= n; i++) {
        //     if(n%i == 0) {
        //         ans++;
        //     }
        // }
        // System.out.print(ans);
        
        
        /*
        Given a number N.
        Tell if the number N is a prime number or not?
        
        1. Prime numbers have 2 factors
            1 , N (number itself)
            17 --> 1, 17
            1 --> 1 (Neither prime nor composite)
            24 --> 1, 2, 3, 4, 6, 8, 12, 24
            N%1 = 0;
            N%N = 0;
            Count of factors == 2 ===>> Prime number
        */
        
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        //     if(n%i == 0) {
        //         count++;
        //     }
        // }
        // if (count == 2) {
        //     System.out.println(n + " is a prime number");
        // } else {
        //     System.out.println(n + " is not a prime number");
        // }
        
        
        // [2, N-1]
        // int count = 0;
        // for (int i = 2; i <= n-1; i++) {
        //     if(n%i == 0) {
        //         count++;
        //     }
        // }
        // if (count == 0) {
        //     System.out.println(n + " is a prime number");
        // } else {
        //     System.out.println(n + " is not a prime number");
        // }
        
        /*
        Min no of natural numbers starting from 1 to add to get the sum >1
        */
        
        /*
        n = 10;
            i   sum=0   count=0
            1     1         1
            2     3         2
            3     6         3
            4     10        4. ===> sum >=n Stop.
            5     10        4
            6     10        4
            7
            8
            9
            10 
        */
        // int count = 0;
        // int sum = 0;
        // for (int i=1; i <=n ; i++) {
        //     System.out.print(i + ", ");
        //     if (sum < n) {
        //         sum = sum+i;
        //         count++;
        //     }
        //     else {
        //         break;
        //     }
        // }
        
        int count = 0;
        int sum = 0;
        for (int i=1; sum < n ; i++) {
            System.out.print(i + ", ");
            sum = sum+i;
            count++;
        }
        
        System.out.println("Count = " + count);
    }
}