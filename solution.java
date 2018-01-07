import java.util.*;
import java.lang.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int n = sc.nextInt();
	    String a = sc.next();
	    
	    StringBuilder temp = new StringBuilder();
	    int sLen = s.length();
	    for(int i =0,ctr=0;i<n;i++,ctr++)
	    {
	        if(ctr>sLen-1)
	        {
	            ctr=0;
	        }
	        temp.append(String.valueOf(s.charAt(ctr)).toLowerCase());
	    }
	    int count =0;
	    for(int i =0;i<temp.length();i++)
	    {
	        if(String.valueOf(temp.charAt(i)).equals(a))
	        count++;
	    }
	    System.out.println(count);
	}
}
