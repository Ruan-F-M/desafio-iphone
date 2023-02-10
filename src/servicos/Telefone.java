package servicos;
import aparelho.Iphone;

public class Telefone extends Iphone {
    public void ligar() {
        System.out.println("FAZENDO LIGAÇÂO!");
    }
    public void atender() {
        System.out.println("ATENDENDO CHAMADA!");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ!");
    }
}
