import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm{

	// public static void main(String[] args) {
	// 	int[] someArray = {52, 5, 3, 10, 9};
	// 	sort(someArray);
	// 	System.out.println(Arrays.toString(someArray));
		
	// }

	public void sort(int[] arr) {

		//runs the helper method for the insertion sort
        insertionSort(arr);

	}

	public void insertionSort(int[] a) {
        
		for(int i = 0; i < a.length; i++){

			int temp = a[i];

			int k = i - 1;

			while(k >= 0 && a[k] > temp){

				a[k + 1] = a[k];
				--k;
			}

			a[k + 1] = temp;

		}

	}

}