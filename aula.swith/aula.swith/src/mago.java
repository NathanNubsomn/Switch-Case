import javax.swing.*;

public class mago {
    public static void main(String[] args) {
        String menu = "Escolha seu personagem: \n"+
                "1 - Guerreiro ⚔️⚔️⚔️ \n"+
                "2 -Mago 🧙‍♂️🧙‍♂️🧙‍♂️ \n" +
                "3 - Arqueiro 🏹🏹🏹";
        String respostaUser = JOptionPane.showInputDialog(menu);
        int botaoApertado = Integer.parseInt(respostaUser);
        switch (botaoApertado){
            case 1:
            JOptionPane.showInputDialog(null,"Você escolheu o guerriro! ");
            case 2:
            JOptionPane.showInputDialog(null,"Você escolheu o mago! ");
            break;
            case 3:
                JOptionPane.showInputDialog(null,"Codigo errado!");
                break;
        }

    }
}
