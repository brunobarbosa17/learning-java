
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int idLivro;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anoPublicacao, String categoria, int idLivro) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.idLivro = idLivro;
		this.disponivel = true;
	}
	
	public boolean emprestimo() {
		if (this.disponivel) {
			this.disponivel = false;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean devolucao() {
		if (!this.disponivel) {
			this.disponivel = true;
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimir() {
		System.out.println("Nome do livro: " + this.titulo);
		System.out.println("Autor do livro: " + this.autor);
		System.out.println("Ano de Publicação do livro: " + this.anoPublicacao);
		System.out.println("Categoria do livro: " + this.categoria);
		System.out.println("ID do livro: " + this.idLivro);
		System.out.println("O livro está disponível? " + this.disponivel);
		
	}

}
