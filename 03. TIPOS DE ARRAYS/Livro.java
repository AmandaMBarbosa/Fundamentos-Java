// CATÁLOGO DE LIVROS COM ARRAYS E MANIPULAÇÃO DE STRINGS
public class Livro {
    // Atributos da classe
    public String titulo;
    public String autor;
    public int anoPublicacao;
    
    // Construtor da classe
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para imprimir livros cadastrados
    public void imprimir(){
        System.out.println("- Título: " + titulo + "\n- Autor: " + autor + "\n- Ano de Publicação: "+ anoPublicacao);
    }
}
