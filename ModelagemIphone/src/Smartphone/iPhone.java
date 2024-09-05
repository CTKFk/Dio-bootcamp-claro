public class iPhone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {
    
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void playMusic() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Música pausada.");
    }

    @Override
    public void nextTrack() {
        System.out.println("Próxima faixa.");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void makeCall(String contact) {
        System.out.println("Ligando para " + contact);
    }

    
    @Override
    public void answerCall() {
        System.out.println("Atendendo a chamada.");
    }

    @Override
    public void endCall() {
        System.out.println("Chamada encerrada.");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void navigateTo(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Página recarregada.");
    }

    @Override
    public void addBookmark(String url) {
        System.out.println("Adicionado aos favoritos: " + url);
    }

    // Método principal para testar a classe iPhone
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando as funcionalidades de reprodutor musical
        meuIPhone.playMusic();
        meuIPhone.pauseMusic();
        meuIPhone.nextTrack();

        // Testando as funcionalidades de telefone
        meuIPhone.makeCall("João");
        meuIPhone.answerCall();
        meuIPhone.endCall();

        // Testando as funcionalidades de navegador
        meuIPhone.navigateTo("www.exemplo.com");
        meuIPhone.refreshPage();
        meuIPhone.addBookmark("www.exemplo.com");
    }
}
