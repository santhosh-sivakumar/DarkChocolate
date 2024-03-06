import java.util.Scanner;

class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String arr[]= new String[s.length()-k+1];
        for(int i=0; i<s.length()-k+1; i++)
        {
            arr[i] = s.substring(i, i+k);
        }
        
        smallest = arr[0];
        largest = arr[0];
        
        for(int i=0; i<s.length()-k+1; i++)
        {
            if(smallest.compareTo(arr[i])>0)
                smallest = arr[i];
            if(largest.compareTo(arr[i])<0)
                largest = arr[i];
                
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}