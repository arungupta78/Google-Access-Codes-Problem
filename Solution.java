public class Solution {
    public static int solution(int[] l) {
        
		int count = 0;
		for (int i = 0; i < l.length; i++) {
			for (int j = i + 1; j < l.length; j++) {

				if (l[j] % l[i] == 0) {
					count = count + foundFirst(l, j, l[j]);
				}
			}
		}
		return count;
	}

	private static int foundFirst(int[] l, int j, int value) {
		int count = 0;
		for (int x = j + 1; x < l.length; x++) {

			if (l[x] % value == 0) {
				count++;
			}
		}

		return count;
	}
}
