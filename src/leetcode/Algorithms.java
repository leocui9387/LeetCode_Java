package leetcode;

public class Algorithms {
	public static <T extends Comparable<T>> void QuickSort_Dups(T[] p_array, int p_beg, int p_end) {
		
		int pivot_loc = 0;
		int dupz = 0;
		// find index of first element
		for(int i= 1; i<p_array.length; i++) {
			if (p_array[i].compareTo(p_array[0]) != 1) {
				if (p_array[i].compareTo(p_array[0]) == 0) dupz++;
				else pivot_loc++;
			}
			
		}
			
		Algorithms.Swap(p_array[0], p_array[pivot_loc]);
		
		// squeeze
		
		int left = p_beg;
		int right = p_end;
		
		while(left < right) {
			
			while(p_array[pivot_loc].compareTo(p_array[left]) < 0 && pivot_loc > left) {
				left++;
			}
			
			if(p_array[pivot_loc].compareTo(p_array[left]) == 0) {
				Algorithms.Swap(p_array[left], p_array[pivot_loc + dupz]);
				dupz--;
				continue;
			}
			
			while(p_array[pivot_loc].compareTo(p_array[right]) > 0 && pivot_loc + dupz < right) {
				right--;
			}
			
			if(p_array[pivot_loc].compareTo(p_array[right]) == 0) {
				Algorithms.Swap(p_array[right], p_array[pivot_loc + dupz]);
				dupz--;
				continue;
			}
			
			Algorithms.Swap(p_array[left], p_array[right]);
			
			//safety
			System.out.println(left +"|"+ right);
			
		}
		
		
		
		
		
		
	}
	
	public static <T> void Swap(T p1, T p2){
		T buff = p1;
		p1 = p2;
		p2 = buff;
		
	}
}
