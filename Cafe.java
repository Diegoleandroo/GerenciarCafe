package br.com.cafe;

import java.util.Scanner;

public class Cafe {
	
	
	public enum CoffeeSize{
		
		SMALL(2.50), MEDIUM(3.50), LARGE(4.50);
		
		
		private double cafe;
		
		CoffeeSize (double cafe){
			
			this.cafe = cafe;
			
		}
		
		
		public String getPrice() {
			
			return String.format("%.2f", cafe);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SMALL - R$ 2,50");
		System.out.println("MEDIUM -R$ 3,50");
		System.out.println("LARGE - R$ 4,50");
		
		System.out.println();
		
		System.out.println("Digite o tamanho desejado:");
		String escolha = sc.nextLine();
		
		
		try {
			
			CoffeeSize coffee = CoffeeSize.valueOf(escolha);
			
			System.out.println("O preço e R$ " + coffee.getPrice().toUpperCase());
			
			
		} catch (IllegalArgumentException e){
			
			
			System.out.println("Tamanho inválido, Por favor, escolha a opção válida.");
			
				
		}
		
		
		sc.close();
		
	}
	

}
