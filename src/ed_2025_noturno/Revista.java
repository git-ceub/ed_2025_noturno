package ed_2025_noturno;

public class Revista {
	
	private int paginas;
	private String assunto;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

}
