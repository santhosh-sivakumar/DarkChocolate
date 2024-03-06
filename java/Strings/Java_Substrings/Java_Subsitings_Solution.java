import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        String outstr = S.substring(start, end);
        
        System.out.println(outstr);

        in.close();
    }
}