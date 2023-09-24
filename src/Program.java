public class Program {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Reprodutor Musical
        iphone.selecionarMusica("Welcome To The Jungle - Guns N' Roses");
        iphone.tocar();
        iphone.pausar();

        // Aparelho Telefonico
        iphone.ligar("Emerson Bezerra");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.google.com");
        iphone.atualizarPagina();

        // teste Interfaces
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        reprodutorMusical.tocar();
        aparelhoTelefonico.iniciarCorreioVoz();
        navegadorInternet.adicionarNovaAba();
    }
}