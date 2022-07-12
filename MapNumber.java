import java.util.*;

class MapNumber {

    public static void main(String args[]) {

        int n = 5;
        int k = 10;
        int m = 0;
        for(int i = 1; i<=n; i++) 
        {
            m = k + m;
            System.out.println(i+"-"+m);
        }
    }

}