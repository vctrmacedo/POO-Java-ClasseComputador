public class Main {

	public static void main(String[] args) {
		/* Criando as instâncias da Classe Computador, colocando valores como argumento. */
		Computador computador = new Computador("Azul", "GTX 1030", 8, 1000, 2.8f);
		Computador computador2 = new Computador("Cinza", "RTX 4070", 32, 2000, 4.2f);
		Computador computador3 = new Computador("Rosa", "RTX 4060", 32, 2000, 3.8f);
		Computador computador4 = new Computador("Preto", "GTX 1050", 16, 1000, 3.0f);
		Computador computador5 = new Computador("Verde", "GTX 1050", 16, 1000, 3.2f);
		
		/* Imprimindo as informações dos computadores. */
		computador.Imprimir();
		computador2.Imprimir();
		computador3.Imprimir();
		computador4.Imprimir();
		computador5.Imprimir();

	}
}
