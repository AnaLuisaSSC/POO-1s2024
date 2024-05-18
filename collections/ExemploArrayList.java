package collections;

import java.util.ArrayList;

public class ExemploArrayList {
    
    public static void main (String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        System.out.println(nomes.get(1));  /*imprime o sa posição 1, nesse caso bob */

        for (String nome : nomes){
            System.out.println(nome);
        }

        if (nomes.contains("Carol")){
            System.out.println("Carol está na lista.");
        }

        nomes.remove("Carol");

        if (!nomes.contains("Carol")){
            System.out.println("Carol NÃO está na lista.");
        }

        nomes.clear();
        if(nomes.isEmpty()){
            System.out.println("A lista está vazia");
        }
    }
}
