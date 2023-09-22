package excatalogolivros;

public class ExCatalogoLivros {

    public static void main(String[] args) {
        Livro l = new Livro();
        
        l.adicionarLivro("Pequeno Principe", "Juahn", 1999);
        l.adicionarLivro("Turma da Monica", "Mauricio", 2001);
        l.adicionarLivro("O Principe", "Maquiavel", 1935);
        l.adicionarLivro("Redes de Computadores", "Kurose", 2020);
        
        System.out.println(l.pesquisarPorAutor("Juahn"));
        
        System.out.println(l.pesquisarPorIntervaloAnos(2001, 2020));
        
        System.out.println(l.pesquisarPorTitulo("Redes de Computadores"));
        
    }
}
