package Usuario;

import aparelho.Iphone;
import servicos.Navegador;
import servicos.ReprodutorMusical;
import servicos.Telefone;

public class Ruan {
    public static void main(String[] args) {
        Iphone iphone = null;

        String servicoEscolhido ="phone";

        if(servicoEscolhido.equals("exp"))
            iphone = new Navegador();
        else if(servicoEscolhido.equals("rpd"))
            iphone = new ReprodutorMusical();
        else if(servicoEscolhido.equals("phone"))
            iphone = new Telefone();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();


    }
}