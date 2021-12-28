package br.com.rebeca.exercicio;

public class TesteCachorro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.setNome("Toy");
		cachorro1.setCor("Caramelo");
		cachorro1.setPeso(25);
		
		
		System.out.println("O nome do primeiro cachorro é " + cachorro1.getNome() + ", " + "a cor dele é " + cachorro1.getCor() + "" + " e ele pesa " + cachorro1.getPeso() + ".");
	
		
		Cachorro cachorro2 = new Cachorro();
		
		cachorro2.setNome("Marley");
		cachorro2.setCor("Caramelo");
		cachorro2.setPeso(30);
		
		System.out.println("O nome do segundo cachorro é " + cachorro2.getNome() + ",");
		System.out.println("A cor dele é " + cachorro2.getCor() + ",");
		System.out.println("O peso do Marley é " + cachorro2.getPeso() + ",");
		
	}

}
