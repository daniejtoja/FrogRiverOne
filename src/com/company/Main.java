// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int X, int[] A) {

        if(A.length < X)
            return -1;

        Set<Integer> leafThatAppeared = new HashSet<Integer>();

        for(int i = 0; i<A.length; ++i){

            if(!leafThatAppeared.contains(A[i])){
                leafThatAppeared.add(A[i]);
            } else {
                continue;
            }

            if(leafThatAppeared.size() == X){
                return i;
            } else {

                if(!leafThatAppeared.contains(A[i])){
                    leafThatAppeared.add(A[i]);
                } else {
                    continue;
                }
            }



        }


        return -1;
    }
}
