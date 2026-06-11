public class DESAFIOROUPAS {
    public static void main(String[] args) {
        String Descontos = "Ouro";
        Double ValorTotal = 100.0;
        Double PrecoDesconto = 0.0;

        Double valorDesconto = ValorTotal * (PrecoDesconto / 100);
        Double precoFinal = ValorTotal - valorDesconto;


        switch (Descontos) {
            case "Ouro":
                PrecoDesconto = 0.20;
                break;
            case "Prata":
                PrecoDesconto = 0.10;
                break;
            case "Bronze":
                System.out.println("Sem desconto");
                break;

        }
    }
}
