public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Self Control - Laura Branigan");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("43996937070");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://web.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
