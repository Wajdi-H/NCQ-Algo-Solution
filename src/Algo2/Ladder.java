package Algo2;

public class Ladder {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {4, 4, 5, 5, 1};
        int[] b = {3, 2, 4, 3, 1};

        a = s.laddersol(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
