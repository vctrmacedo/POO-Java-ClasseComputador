
/* Criando a classe computador, com seus atributos. */

public class Computador {
	public String cor, placaVideo;
	public float gbMemoria;
	public float gbHd;
	public float ghzProcessador;
	
	/* Criando o  método construtor. */
	
	public Computador(String cor, String placaVideo, float gbMemoria, float gbHd, float ghzProcessador) {
		this.cor = cor;
		this.placaVideo = placaVideo;
		this.gbMemoria = gbMemoria;
		this.gbHd = gbHd;
		this.ghzProcessador = ghzProcessador;
	}
	
	/* SETTERS */
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPlaca(String placaVideo) {		
		this.placaVideo = placaVideo;
	}
	
	public void setMemoria(float gbMemoria) {
		this.gbMemoria = gbMemoria;
	}
	
	public void setHd(float gbHd) {
		this.gbHd = gbHd;
	}
	
	public void setProcessador(float ghzProcessador) {
		this.ghzProcessador = ghzProcessador;
	}
	
	/* GETTERS */
	
	public String getCor() {
		return cor;
	}
	
	public String getPlaca() {
		return placaVideo;
	}
	
	public float getMemoria() {
		return gbMemoria;
	}
	
	public float getHd() {
		return gbHd;
	}
	
	public float getProcessador() {
		return ghzProcessador;
	}
	
	/* IMPRIMIR */
	
	public void Imprimir() {
		
		System.out.println("====================================================");
		System.out.println("A cor do computador é: "+ getCor());
		System.out.println("A placa de vídeo do computador é: " + getPlaca());
		System.out.println("O Computador possui memória de: " + getMemoria());
		System.out.println("A capacidade de armazenamento (HD) é de: " + getHd());
		System.out.println("O ghz do processador é de: " + getProcessador());
		System.out.println("====================================================");
		
	}		
	
}

