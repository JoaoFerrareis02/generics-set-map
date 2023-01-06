package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem5 {

	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		set.remove("Tablet");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for(String s : set) {
			System.out.println(s);
		}

	}

}
