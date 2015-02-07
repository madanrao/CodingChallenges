import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.TreeSet;
public class Palindrome {
  /*
 * Complete the function below.
 */
        public TreeSet<String> set = new TreeSet<String>();
    //Function to take input and spit out how many substrings are palindromes
    public int palindrome(String str) 
    {
        if(str.length()>5000)
            return 0;
        int count = 0;
        int check =0;    
        boolean flag = true;
        
        
        insert(str);
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
            count += checkIfPalindrome(iterator.next().toString());
        
        
        return count;
    }
    // Function to insert a unique substring into the TreeSet, which will be later checked for palindrome validity
    public void insert(String dup)
        {
            //base case
        if(dup.length()==1)
            {
            set.add(dup);
            return;
            }
            //Dynamic programming style checking if recursion has already been solved
         if(set.contains(dup))
         {
             return;
         }
         // the other base case, may never be executed
        if(dup.length()<1)
            return;
            
            set.add(dup);
            //cut out the leftmost and rightmost characters and call the same function again
            insert(dup.substring(0,dup.length()-1));
            insert(dup.substring(1,dup.length()));
            
        }
    //checks if the given string is a palindrome. Returns 1 if true else returns 0. Takes O(n/2) time
    public int checkIfPalindrome(String s)
        {
            if(s.length()==1)
                return 1;
        boolean flag = true;    
        int i=0;
        int j=s.length()-1;
        while(i<=j)
            {    
            if(!(s.charAt(i)==s.charAt(j)))
                {    
                    flag = false;
                    break;
                }
            i++;
            j--;
            }
        if(flag)
            return 1;
        else
            return 0;
        }
        
    public static void main(String[] args) throws IOException{
        //Scanner in = new Scanner(System.in);
        Palindrome s = new Palindrome();
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        String _str="aabaa";
        
        /*try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
        */
        res = s.palindrome(_str);
        System.out.println(res); 
        //bw.close();
    }
}
