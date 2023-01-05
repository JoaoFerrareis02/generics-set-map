package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Problem2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>(); 
		
		String path = "C:\\Programacao\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line!=null) {
				String[] parts = line.split(",");
				String name = parts[0];
				double price = Double.parseDouble(parts[1]);
				list.add(new Product(name, price));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
			
			
		}catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
