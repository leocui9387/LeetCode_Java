package leetcode;

public class lc389_FindTheDifference {
	
	public void lc389_FindTheDifference() {
		
	}
	
	public static void runner() {
		
		
		String s = "abcd";
		String t = "abcde";
		
		Algorithms.QuickSort_Dups<char>(s.toCharArray(), 0, s.length() -1 );
		
		System.out.println(lc389_FindTheDifference.findTheDifference(s, t));
		
		
	}
	
	public static char findTheDifference(String s, String t) {
		
		
		
		
		
		return 'c';
    }
	
	
}
