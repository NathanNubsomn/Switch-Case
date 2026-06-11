public class netflix {
    public static void main(String[] args) {
        String aplicativos = "Streaming";
        switch (aplicativos) {
            case "Streaming":
                System.out.println("O app de streaming mais famoso é a netflix");
                break;
            case "Rede Social":
                System.out.println("A rede social mais famosa é o instagram");
                break;
            case "Jogos":
                System.out.println("O jogo mais famos é o minecraft");
                break;
            default:
                System.out.println("Só tem 3 opções");
        }
    }
}