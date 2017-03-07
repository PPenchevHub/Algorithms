
public class SortDemo {
	
	public static void main(String[] args){
		
		Selection s = new Selection();
		int[] array = {1,3,2,4,0,45};
		Insertion in = new Insertion();
		BubbleSort bub = new BubbleSort();
		
		bub.sort(array);
		//in.sort(array);
		//s.sort(array);
		for(int i:array){
			System.out.print(i + ", ");
		}
		
	}

}
