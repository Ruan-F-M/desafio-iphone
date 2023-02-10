package servicos;

import aparelho.Iphone;

public class ReprodutorMusical extends Iphone {
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO REPRODUTOR DE MÚSICA!");
    }
    public void pausar() {
        System.out.println("Pausando A MÚSICA ATUAL!");
    }
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA!");
    }
}
