package livraria;

import java.util.Scanner;

public class Sistema {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando livro");
                    break;
                case 2:
                    System.out.println("Listando livro");
                    break;
                case 3:
                    System.out.println("Deletando livro");
                    break;
                case 4:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
             }
        }
        sc.close();    
    }
}
