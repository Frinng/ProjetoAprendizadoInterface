import javax.swing.*; //esta biblioteca serve para criar interface grafica //Criar os elementos da interface gráfica
import java.awt.event.ActionEvent; //esta biblioteca serve para responder o usuario //	Representa o evento (clique, etc.)
import java.awt.event.ActionListener;//esta biblioteca serve para receber os dados do usuario//Permite programar a reação ao evento

public class principal {
    public static void main(String[] args) {
        //Cria a janela(frame/tela)
        JFrame tela = new JFrame("Teste de Interface");
        tela.setSize(1000,700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        tela.setVisible(true);
    }
}
