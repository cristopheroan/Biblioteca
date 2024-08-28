package main.java.com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Adicionar Livro");

            System.out.println("2. Remover Livro");

            System.out.println("3. Buscar Livro");

            System.out.println("4. Listar Livros");

            System.out.println("5. Sair");

            System.out.println("Escolha uma opção");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                System.out.println("Título; ");
                String titulo = scanner.nextLine();

                System.out.println("Autor: ");
                String autor = scanner.nextLine();

                System.out.println("ISBN: ");
                String isbn = scanner.nextLine();
                Livro livro = new Livro(titulo, autor, isbn);

                biblioteca.adicionarLivro(livro);
                break;

                case 2:
                System.out.println("ISBN do livro a remover: ");
                String isbnRemover = scanner.nextLine();

                biblioteca.removerLivro(isbnRemover);
                break;

                case 3:
                System.out.println("ISBN do livro a buscar: ");
                String isbnBuscar = scanner.nextLine();
                Livro livroEncontrado = biblioteca.buscarLivro(isbnBuscar);

                System.out.println(livroEncontrado != null ? livroEncontrado : "Livro não encontrado");
                break;

                case 4:
                biblioteca.listarLivros();
                break;

                case 5:
                System.out.println("Saindo...");

                scanner.close();
                return;
                default:
                System.out.println("Opção inválida");
            }
        }
    }

}
