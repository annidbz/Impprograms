import java.util.HashSet;

public class Longestsubstring {
	
	public static void LongestSubstring(String s) {
	
		int apointer = 0;
		int bpointer =0;
		int max = 0;
		HashSet hs = new HashSet<>();
		while(bpointer<s.length()) {
			
			if(!hs.contains(s.charAt(bpointer))) {
				hs.add(s.charAt(bpointer));
				bpointer++;
				max = Math.max(hs.size(),max);
			}
			else {
				hs.remove(s.charAt(apointer));
				apointer++;
			}
			
			
		}
		System.out.println(hs.size());
		
		
	}
	
	public static void main(String[] args) {
		String s ="abcabcbb";
		
		LongestSubstring(s);
	}
	
}
