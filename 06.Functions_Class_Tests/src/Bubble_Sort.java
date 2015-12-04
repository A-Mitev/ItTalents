import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] array = { 2, 6, 1, 4, 7, 4, 12, 9, 21, 15, 3141, 23, -6};

		for (int index = 1; index < array.length; index++) {
			boolean isSorted = true;
			for (int j = 0; j < array.length - index; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					isSorted = false;
				}
			}
			
			if(isSorted){
				break;
			}
		}

		System.out.println(Arrays.toString(array));

	}

}
