package livraria;

import java.util.ArrayList;

public class Livraria {

    public ArrayList<Livro> livros;

    public Livraria(){
        this.livros = new ArrayList<>();

    }

    public void cadastroLivro(Livro livro){
        this.livros.add(livro);
    }

    public String listarLivros(){
        String listarLivros = ""; 

        for (Livro l : this.livros) {
            listarLivros += l.id + " - " + l.titulo  + "\n";
        }

        return listarLivros;
    }
    public String detalharLivroPorId(int id){
        String detalheLivro = "livro não encontrado. \n";

        return detalheLivro;
    }
}

