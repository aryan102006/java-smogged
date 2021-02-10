import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		int[] array = {32, 98, 12, 86, 42};

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		System.out.println("Arrays after sorting \n" + Arrays.toString(array));
	}
}
