public class Task04 {
	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int[][] newArray = new int[array.length][array.length];

		for (int i = 0; i < array[0].length; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				newArray[i][(newArray.length - j) - 1] = array[j][i];
			}
		}
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				if (j == newArray[i].length - 1) {
					System.out.print(newArray[i][j]);
					break;
				}
				System.out.print(newArray[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
