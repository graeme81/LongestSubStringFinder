package dailyProblem;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		
		int k = 2;
		String s = "people";
		
		int x = longetstSubString(s, k);
		
		System.out.println("The longest substream with " + k + " different letters is " + x);

	}

	public static int longetstSubString(String s, int k) {
		
		int count = k;
		int start = 0;
		
		while(count+start < s.length()) {
			String temp = s.substring(start, count+start+1);
			Set<Character> set = new HashSet<Character> (temp.chars()
															 .mapToObj(c -> (char) c)
															 .collect(Collectors.toList()));
			if(set.size() == k) {
				count++;
			}else {
				start++;
			}
		}
		
		return count;
	}
}