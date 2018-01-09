import java.util.*;
public class Hello {
    public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   String input = sc.next();
	   char[] inputArray = input.toCharArray();
	   int n = sc.nextInt();
	   String search = sc.next();
	   
	   int inputArrayLength = inputArray.length;
	   ArrayList<String> temp = new ArrayList<String>();
	   int counter = 0;
	   for(int i=0;i<n;i++,counter++)
	   {
	       if(counter>inputArrayLength-1)
	       {
	           counter=0;
	       }
	       temp.add(String.valueOf(inputArray[counter]));
	   }
	   System.out.println(Collections.frequency(temp,search));
	}
}
