public class semaforo {
    public static void main(String[] args) {
        String corSinal = "Vermelho";
        switch (corSinal){
            case "Verde":
                System.out.println("Pode passar ! 🚗🚗🚗");
                break;
            case "Vermelho":
                System.out.println(" Pare ! Não avance ! 🛑🛑🛑");
                break;
            case "Amarelo":
                System.out.println("Atençao diminua a velocidade! 🟨🟨🟨");
                break;

        }
    }
}
