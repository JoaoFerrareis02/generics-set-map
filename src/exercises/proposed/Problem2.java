package exercises.proposed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String,Integer> votes = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		File file = new File(sc.next());
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] vects = line.split(",");
				String name = vects[0];
				int quantity = Integer.parseInt(vects[1]);
				
				if(!votes.containsKey(name)) {
					votes.put(name, quantity);
				}
				else {
					votes.put(name, votes.get(name)+quantity);
				}
				
				line = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key+": "+votes.get(key));
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		sc.close();
	}

}
