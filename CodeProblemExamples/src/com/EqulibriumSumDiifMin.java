package com;

/**
 * @Ranjan Kumar A non-empty zero-indexed array A consisting of N integers is
 *         given. Array A represents numbers on a tape. Any integer P, such that
 *         0 < P < N, splits this tape into two non−empty parts: A[0], A[1],
 *         ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * 
 *         The difference between the two parts is the value of: |(A[0] + A[1] +
 *         ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * 
 *         In other words, it is the absolute difference between the sum of the
 *         first part and the sum of the second part.For example, consider array
 *         A such that: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3
 * 
 *         We can split this tape in four places: P = 1, difference = |3 − 10| =
 *         7 P = 2, difference = |4 − 9| = 5 P = 3, difference = |6 − 7| = 1 ->
 *         Minimum Difference P = 4, difference = |10 − 3| = 7
 * 
 *         Write a function: int solution(int A[], int N); that, given a
 *         non-empty zero-indexed array A of N integers, returns the minimal
 *         difference that can be achieved 
 *         Problem Source: Codility
 */
public class EqulibriumSumDiifMin {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 3, 1, 2, 4, 3 };
		int j, k;
		int diffFinal = Integer.MAX_VALUE;
		int diff = 0;

		for (int i : array) {
			int forward = 0;//pointer
			int backward = 0;//pointer
			j = i + 1;
			k = i;
			while (j < array.length) {
				forward += array[j];

				j++;
			}
			System.out.println("forward::" + forward);
			while (k >= 0) {
				backward += array[k];

				k--;
			}
			System.out.println("backward::" + backward);
			diff = Math.abs(forward - backward);
			System.out.println("Diff::::" + diff);
			;
			if (diff < diffFinal)
				diffFinal = diff;
			System.out.println("DiffFinal;;" + diffFinal);

		}

		System.out.println("Minimum Difference:::" + diffFinal);
	}

	

}
