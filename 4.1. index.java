import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        /*
        Q1 : Print all the numbers from 1 to N(Input)
        */
        
        //Initialisation.
        // int i = 1;
        
        // while(i <= n) {
        //     System.out.println(i);
        //     //i = i + 1 ====> i++
        //     i++;
        // }
        
        /*
        Q2 : Print all odd numbers from 1 to N(Input)
        */
        //How to check if n is odd or even
        // if (n%2==0) {
        //     System.out.print("N is even");
        // }
        
        // if (n%2!=0) {
        //     System.out.print("N is odd");
        // }
        
        
        //ANS
        // int i=1;
        // while(i<=n) {
        //     if (i%2 != 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        
        // +2 +2 +2
        //1, 3, 5, 7, 9, 11, 13 ..........
        // int i=1;
        // while(i<=n) {
        //     System.out.println(i);
        //     i = i+2;
        // }
        
        
        /*
        Q3 : Even numbers from 1 to N
        */
        
        // 2, 4, 6, 8
        // int i=2;
        // while(i<=n) {
        //     System.out.println(i);
        //     i = i+2;
        // }
        
        
        /*
        Q4 : Print all the multiples of 4 between 1 to N
        */
        
        // int i=1;
        // while(i<=n) {
        //     if (i%4 == 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
        
        
        /*
        Q5 : Print all the perfect squares from 1 to 100
        1,4, 9, 16, 25, 36, 49, 64, 81, 100
        */
        
        // N times
        // 1, 2, 3, 4, 5, ..... 10, 11, 12.........100
        // int i = 1;
        // while(i<=n) {
        //     if (i*i<=n) {
        //         System.out.println(i*i);
        //     }
        //     i++;
        // }
        
        
        //1 .... 10 -- sqrt(N)
        // int i = 1;
        // while(i*i<=n) {
        //     System.out.println(i*i);
        //     i++;
        // }
        
        // while(n>0) {
        //     System.out.println(n%10);
        //     n = n/10;
        // }
        
        /*
        Given an integer input.
        Find the sum of digits. [0-9]
        N = 12345 ==> 1+2+3+4+5 = 15
        */
        
        int sum = 0;
        while(n>0) {
            sum = sum + n%10;
            n = n/10;
        }
        
        System.out.print(sum);
    
    }
}