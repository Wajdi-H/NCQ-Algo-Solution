package Algo3;

public class minsequance {


    public static void main(String[] args) {
        Solutionalgo3 s = new Solutionalgo3();
        int [] A= {1,5,2,-2};

        int [ ] c = new int [4];
        c=s.countsequance(A);
        for(int j=0 ;j<c.length;j++)

        {
            System.out.println(s.countsequance(A)[j]);
        }


    }


}
