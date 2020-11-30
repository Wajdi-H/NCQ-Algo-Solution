package Algo1;

public class countalgo {

	public static void main(String[] args) {
		solution s = new solution();
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		
		int [] counter = new int[5];
		counter =s.addcounter(5, A);

		for (int i = 0; i<counter.length ; i++) {
			System.out.println(counter[i]);

		}
	}

}
