package exercicio_polimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando os objetos
        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("=== CADASTRO DE LIVRO ===");
        System.out.print("Digite o nome do livro: ");
        livro.setNome(scanner.nextLine());

        System.out.print("Digite o preço do livro: ");
        livro.setPreco(scanner.nextDouble());
        scanner.nextLine(); // Limpeza do buffer do teclado

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.nextLine());

        System.out.println("\n=== CADASTRO DE CD ===");
        System.out.print("Digite o nome do CD: ");
        cd.setNome(scanner.nextLine());

        System.out.print("Digite o preço do CD: ");
        cd.setPreco(scanner.nextDouble());

        System.out.print("Digite a quantidade de faixas do CD: ");
        cd.setNumFaixas(scanner.nextInt());

        // Exibindo as informações do CD cadastrado usando o método da interface
        cd.exibeInformacoes();

        scanner.close();
    }
}