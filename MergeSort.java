import java.util.Arrays;

public class MergeSort implements SortingAlgorithm{

	// public static void main(String[] args) {
	// 	int[] someArray = {5, 2, 1, 3, 6, 7};
	// 	sort(someArray);
	// 	System.out.println(Arrays.toString(someArray));
		
	// }


	public  void sort(int[] arr) {

		//runs the helper method for the merge sort
        mergeSort(arr, 0, arr.length - 1);

	}


public void mergeSort(int[] a, int left, int right) {

     	
     	if(left < right){
     		

     	int mid = (left + right) / 2;
     	

     	mergeSort(a, left, mid);
     	mergeSort(a, mid + 1, right);

     	merge(a, left, mid, right);

     }

	}


	public void merge(int targetArr[], int l, int mid, int r){

		int leftSize = mid - l + 1;
     	int rightSize = r - mid;

     	// Create temp arrays 
        int leftArr[] = new int [leftSize]; 
        int rightArr[] = new int [rightSize]; 
  
        //Copy data to temp arrays
        for (int i=0; i<leftSize; ++i){
            leftArr[i] = targetArr[l + i]; 
        }
        for (int j=0; j<rightSize; ++j){
            rightArr[j] = targetArr[mid + 1 + j]; 
        }

		int left = 0;
		int right = 0;
		int target = l;

		while(left < leftSize && right < rightSize){

			if(leftArr[left] <= rightArr[right]){

				targetArr[target++] = leftArr[left++];
				

			}else{

				targetArr[target++] = rightArr[right++];
				
			}
			


		}

		while(left < leftSize){

			targetArr[target++] = leftArr[left++];
			
		}

		while(right < rightSize){

			targetArr[target++] = rightArr[right++];

		}

	}

}


