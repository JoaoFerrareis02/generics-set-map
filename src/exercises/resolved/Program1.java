package exercises.resolved;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import exercises.entities.Client;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		File file = new File(sc.next());
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			Set<Client> set = new HashSet<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] vects = line.split(" ");
				String name = vects[0];
				Date instant = Date.from(Instant.parse(vects[1]));
				
				set.add(new Client(name, instant));
						
				line = br.readLine();
			}
			
			System.out.printf("Total users : %d",set.size());
			
		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		
		
		
		sc.close();
		
	}

}
