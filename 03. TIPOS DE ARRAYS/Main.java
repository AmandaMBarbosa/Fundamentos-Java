// Importa a classe Scanner para entrada de dados
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        // Criação de um array para armazenar 5 objetos do tipo Livro
        Livro[] livros = new Livro[5];

        // Arrays auxiliares com os dados dos livros
        String[] titulos = {
            "A Rainha Vermelha",
            "De Sangue e Cinzas",
            "Um Reino de Carne e Fogo",
            "Quarta Asa",
            "O Fabricante de Lagrimas"
        };

        String[] autores = {
            "Victoria Aveyard",
            "Holly Black",
            "Jennifer L. Armentrout",
            "Rebecca Yarros",
            "Erin Doom"
        };

        // Array com os anos de publicação
        int[] anosPublicacao = {2015, 2018, 2021, 2023, 2023};

        // Laço para instanciar e preencher o array de livros
        for (int i = 0; i < livros.length; i++) {
            // Cria um novo objeto Livro com os dados dos arrays auxiliares
            livros[i] = new Livro(titulos[i], autores[i], anosPublicacao[i]);
        }

        // Cria o objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a palavra-chave para busca
        System.out.println("Digite a palavra-chave:");
        String palavraChave = scanner.nextLine(); // Lê a palavra digitada

        // Exibe a palavra-chave informada
        System.out.println("========================\n" + 
                           "Palavra-Chave: " + palavraChave + 
                           "\n========================");

        // Variável de controle para verificar se algum livro foi encontrado
        boolean encontrado = false;

        // Laço para percorrer o array de livros
        for (int i = 0; i < livros.length; i++) {

            // Verifica se o título contém a palavra-chave (ignorando maiúsculas/minúsculas)
            if (livros[i].titulo.toLowerCase().contains(palavraChave.toLowerCase())) {

                // Exibe as informações do livro encontrado
                livros[i].imprimir();

                // Indica que encontrou pelo menos um livro
                encontrado = true;

                // Mensagem de sucesso
                System.out.print("\nTítulo encontrado com sucesso! Programa finalizado.");
            }
        }

        // Caso nenhum livro seja encontrado
        if (encontrado == false) {
            System.out.println("O livro com a palavra-chave não consta no sistema!");
        }

        // Fecha o Scanner 
        scanner.close();
    }
}