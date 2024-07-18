public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Música está tocando.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para " + numero + ".");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + ".");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página " + url + ".");
    }

    @Override
    public void fecharPagina(String url) {
        System.out.println("Fechando a página " + url + ".");
    }
}
