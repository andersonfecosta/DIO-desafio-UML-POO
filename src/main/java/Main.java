import models.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.iniciarCorreioVoz();
    }
}
