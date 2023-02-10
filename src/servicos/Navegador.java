package servicos;

import aparelho.Iphone;

public class Navegador extends Iphone {
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA!");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA!");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA!");
    }
}
