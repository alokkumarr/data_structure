package HackerRank;

public class ArrayManipulation {
	public static void main(String[] args) {
		int arr[][] = {};
		int n = 0;

		System.out.println(arrayManipulation(n, arr));
	}

	private static int arrayManipulation(int n, int[][] queries) {
		long outputArray[] = new long[n + 2];
		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			outputArray[a] += k;
			outputArray[b + 1] -= k;
		}
		int max = getMax(outputArray);
		return max;
	}

	/**
	 * @param inputArray
	 * @return
	 */
	private static int getMax(long[] inputArray) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
			max = Math.max(max, sum);
		}
		return max;
	}

}




