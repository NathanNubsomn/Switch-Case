public class Guerreiro {
    public static void main(String[] args) {
        int botaoApertado = 5;

        switch (botaoApertado) {
            case 1:
                System.out.println("Você escolheu o guerreiro da Luz ! ⚔️⚔️⚔️");
                break;
            case 2:
                System.out.println("Você escolheu o Mago de Fogo ! 🔥🔥🔥");
                break;
            case 3 :
                System.out.println("Você escolheu a arqueira ! 🏹🏹🏹 ");
                break;
            case 4:
                System.out.println("Você escolheu o braço forte ! 🦾🦾🦾");
                break;
            default:
                System.out.println("Código inválido ! Personagem não encontrado ! 🔎🔎🔎");
        }
    }
}
