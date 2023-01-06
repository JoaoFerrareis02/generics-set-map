package application;

import java.util.HashMap;
import java.util.Map;

import model.entities.ProductMap;

public class Problem6_2 {

	public static void main(String[] args) {
		
		Map<ProductMap, Double> stock = new HashMap<>();
		
		ProductMap p1 = new ProductMap("Notebook", 900.00);
		ProductMap p2 = new ProductMap("Tablet", 500.00);
		ProductMap p3 = new ProductMap("TV", 1200.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 15000.00);
		
		ProductMap ps = new ProductMap("TV", 1200.00);
		
		System.out.println("Contains 'ps' key: "+stock.containsKey(ps));
		
	}

}
