//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} 
// } Driver Code Ends
class Solution
{ 

    static boolean sentencePalindrome(String s)
    { 
        int st=0,end=s.length()-1;
        while(st<end)
        {
            char sc=s.charAt(st);
            char ec=s.charAt(end);
            
            if(Character.isLetter(sc) && Character.isLetter(ec))
            {
                if(Character.toLowerCase(sc)!=Character.toLowerCase(ec))
                    return false;
                st++;
                end--;
            }
            else if(Character.isDigit(sc) && Character.isDigit(ec))
            {
                if(sc!=ec)
                    return false;
                st++;
                end--;
            }
            else if(!Character.isLetter(sc) && !Character.isDigit(sc))
                st++;
            else if(!Character.isLetter(ec) && !Character.isDigit(ec))
                end--;
            else
                return false;
        }
        return true;
    }
}