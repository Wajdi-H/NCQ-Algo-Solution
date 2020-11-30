package Algo1;

public class solution {

	public int[] addcounter(int N, int[] A) {
		int[] Tabcount = new int[N];

		int maxcounter = 0;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == N + 1) {
				for (int k = 0; k < N; k++)
					Tabcount[k] = maxcounter;
			       }

			if ((A[i] <= N) && (A[i] >= 1)) {
				Tabcount[A[i] - 1] += 1;
				if (Tabcount[A[i] - 1] > maxcounter)
					maxcounter = Tabcount[A[i] - 1];
			}
		}
		return Tabcount;
	}

}
