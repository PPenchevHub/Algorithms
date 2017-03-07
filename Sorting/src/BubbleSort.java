
public class BubbleSort {

	
	 public static void sort(int array[]) {
	        int n = array.length;
	        int k;
	        for (int m = n; m >= 0; m--) {
	            for (int i = 0; i < n - 1; i++) {
	                k = i + 1;
	                if (array[i] > array[k]) {
	                	
	                	int temp = array[i];
	        			array[i] = array[k];
	        			array[k] = temp;
	        			
	                }
	            }
	         
	        }
	    }

}
