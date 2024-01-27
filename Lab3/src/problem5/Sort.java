package problem5;

public class Sort {
	static <E> void swap(E [] array, int i, int j) {
		E temp = (E) array[i];
		array[i] = array [j];
		array[j] = temp;
	}
 
	static<E extends Comparable<E>> void bubleSort(E [] array) {
		int n = array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[j].compareTo(array[j+1])==1) {
					swap(array,j,j+1);
				}
			}
		}
}
	static <E extends Comparable<E>> int partition(E [] arr, int low, int high) {
		//E pivot = arr[high];
		int i = low-1;
		for(int j = low; j<high; j++) {
			// If current element is smaller
            // equal to pivot
			if(arr[high].compareTo(arr[j])==1) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		//swap arr[i+1] and pivot;
		return i+1;
	}
	
	static <E extends Comparable<E>> void quickSort( E [] array, int low, int high) {
		// low = 0;
		// high = array.length;
		
		if(low < high) {
			int part = partition(array, low, high);
			
			quickSort(array, low, part-1);
			quickSort(array, part+1, high);
		}
	}
}
