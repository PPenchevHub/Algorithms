
public class Selection  {

	public int[] sort(int[] array) {

		
		for(int i= 0; i < array.length-1;i++){
			int index = i;
			
			for( int k = i+1; k< array.length; k++){
				if(array[k] < array[i])
					index = k;
			}
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
			
		}
		
		return array;
	}
	
}

	
