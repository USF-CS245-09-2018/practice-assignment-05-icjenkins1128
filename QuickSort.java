import java.util.Arrays;

public class QuickSort implements SortingAlgorithm{

	// public static void main(String[] args) {
	// 	int[] someArray = {5, 4, 7, 9, 0, 15};
	// 	sort(someArray);
	// 	System.out.println(Arrays.toString(someArray));
		
	// }

	public void sort(int[] arr) {

		//runs the helper method for the insertion sort
        quickSort(arr, 0, arr.length - 1);

	}

	public void quickSort(int[] a, int left, int right) {

        	
        int p = partition(a, left, right);

        if(left < p - 1){
        	quickSort(a, left, p - 1);
        }
        
        if(right > p){
        	quickSort(a, p, right);
        }
        
		
    	
	}

	public void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public int partition(int[] arr, int left, int right) {


			 int pivot = arr[left];
			
			

			 while(left <= right){


			 	//searching number less than the pivot

			 	while(arr[left] < pivot){
			 		left++;
			 	}

			 	//searching number which is greater than pivot

			 	while(arr[right] > pivot){
			 		right--;
			 	}

			 	// swap the values

			 	if(left <= right){

			 			swap(arr, left, right);

			 			//increment left index and decrement right index
			 			left++;
			 			right--;
			 	}


			 }

			 return left;

			 
		}
			
		
	}

	

		

	

