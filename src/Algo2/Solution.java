package Algo2;

import java.util.*;
import java.lang.*;
public class Solution {

    static int countWaysUtil(int n) {
        int res[] = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= 2 && j <= i; j++)
                res[i] += res[i - j];
        }
        return res[n - 1];

    }
    public int[] laddersol(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i]=(countWaysUtil(a[i]+1)%(2* countWaysUtil(b[i]+1)));
        }
            return a;
    }
}
