package excatalogolivros;

import java.util.ArrayList;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;
    
    public Livro(){}
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    ArrayList<Livro> listaLivros = new ArrayList<>();
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public ArrayList<Livro> pesquisarPorAutor(String autor){
        ArrayList<Livro> buscaPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    buscaPorAutor.add(l);
                }       
            }
        }else{
            System.out.println("A lista esta vazia");
        }
        System.out.println("\nPesquisando pelo Autor: " + autor);
        return buscaPorAutor;
    }
    
    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        ArrayList <Livro> buscaPorAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.anoPublicacao <= anoFinal){
                    buscaPorAno.add(l);
                }
            }
        }else{
            System.out.println("A lista esta vazia!");
        }
        System.out.println("\nPesquisando pelo intervalo de " + anoInicial + " a " + anoFinal);
        return buscaPorAno;
    }
    
    public ArrayList<Livro> pesquisarPorTitulo(String titulo){
        ArrayList <Livro> buscaPorTitulo = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    buscaPorTitulo.add(l);
                    break;
                }
            }
        }else{
            System.out.println("A lista esta vazia.");
        }
        System.out.println("\nPesquisando pelo Titulo: " + titulo);
        return buscaPorTitulo;
    }
    
    @Override
    public String toString(){
        return "\nTitulo: " + this.getTitulo() +
               "\nAutor: " + this.getAutor() +
               "\nAno da publicacao: " + this.getAnoPublicacao();
    }
}