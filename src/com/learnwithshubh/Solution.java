package com.learnwithshubh;

import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        return a.stream().collect(Collectors.collectingAndThen(
                Collectors.toList(), p -> {
                    Collections.reverse(p); return p;
                }
        ));
    }

}

public class Solution {
    public static void main(String[] args) {

        List<Integer> res = Result.reverseArray(Arrays.asList(1,2,4,3));

        System.out.println(res);
    }
}

