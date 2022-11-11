import java.util.*;
class Main {
    static boolean isPalindrome1(String str) {
        String rev = "";
        
        for(int i = str.length()-1 ; i >= 0 ;i--) {
            rev = rev + str.charAt(i);
        }
        
        if(str.equals(rev) == true) {
            return true;
        }
        else {
            return false;
        }
    }
    
    static boolean isPalindrome2(String str) {
        int i = 0;
        int j = str.length()-1;
        
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    static int countUpperCase(String str) {
        int count = 0;
        
        for(int i =0; i < str.length();i++) {
            char ch = str.charAt(i);
            
            if(ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        
        return count;
    }
	public static void main(String[]args) {
        /*
		int a  = 100000;
        int b = 400000;
        
        long c = a * (long)b;
        System.out.println(c);
        */
        
        /*
        float a = 5.2f;
        System.out.println(a);
        */
        
        /*
        int a = 5;
        int b = 2;
        
        float c = (float)a / b;
        System.out.println(c);
        */
        
        //Strings
        /*
        String str = "Hello world";
        System.out.println(str);
        
        //to get char at in index
        char ch = str.charAt(4);
        //System.out.println(ch);
        
        //print each char in single line
        for(int i=0; i < str.length();i++) {
            System.out.println(str.charAt(i));
        }
        
        //to get sub-part of string, str.substring(i,j) -> [i,j)
        String ss = str.substring(1,5); 
        System.out.println(ss);
        */
        
        /*
        String temp = "Hello";
        temp = temp + 'A';
        System.out.println(temp);
        
        temp = temp + "World";
        System.out.println(temp);
        
        temp = temp + 10; 
        System.out.println(temp);
        */
        
        Scanner scn = new Scanner(System.in);
        /*
        // int a = scn.nextInt();
        // long b = scn.nextLong();
        String str = scn.nextLine();
        System.out.println(str);
        
        //use nextLine -> white spaces present in your string eg : Hello World
        //use next -> white spaces are not present in your string eg : Hello
        
        int ans = countUpperCase(str);
        System.out.println(ans);
        */
        
        /*
        char ch = 'A';
        System.out.println(ch);
        
        int as = (int)ch;
        System.out.println(as);
        */
        
        String str = scn.next();
        if(isPalindrome2(str) == true) {
            System.out.println(str + " is Palindromic");
        }
        else {
            System.out.println(str + " is not Palindromic");
        }
    
	}
}