
public class Quicksort {
	
	/*
	 * 
	 * 
	 */
	
	//a method to find the pivot element of the working array and exclude it 
	private static int partition(int []array, int left, int right){
		
		int pivot =array[left + (right-left)/2];
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}

		return left;
	}
	
	public static void quicksort(int[] array, int left, int right){
		if(left >= right){
			return;
		}
		
		int pivot  =  partition(array, left, right);
		quicksort(array, left, pivot-1);
		quicksort(array, pivot, right);
		
		
	}
	
	private static void swap(int[] array, int val1 , int val2){
		
		int temp =  array[val1];
		array[val1] = array[val2];
		array[val2] = temp;
		
	}
	
	public static void sort(int[] array){
		quicksort(array, 0, array.length-1);
		
	}
	
	public static void multithreadedSort(int[] array){
		
		
		
	}


	
	public static void main(String[] args){
		
		int[] newList = {5, 7, 23, 87, 11, 0, 5, 33, 30};
		System.out.println("Unsorted List : ");
		for(int i: newList) {
			System.out.print(i + ", ");
		}
			
		sort(newList);
		System.out.println("\nSorted List: ");
		for(int i: newList) {
			System.out.print(i + ", ");
		}	
		
	}
}
