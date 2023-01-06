package application;

import model.entities.Client;

public class Problem4 {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//Se vc quiser comparar pelo conteúdo, use o equals
		System.out.println(c1 == c2);//Se vc quiser comparar pelo referência, use o '=='
		
	}

}
