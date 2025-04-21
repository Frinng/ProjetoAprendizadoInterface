import javax.swing.*; //esta biblioteca serve para criar interface grafica //Criar os elementos da interface gráfica
import java.awt.event.ActionEvent; //esta biblioteca serve para responder o usuario //	Representa o evento (clique, etc.)
import java.awt.event.ActionListener;//esta biblioteca serve para receber os dados do usuario//Permite programar a reação ao evento

public class principal {
    public static void main(String[] args) {
        //Cria a janela(frame/tela)
        JFrame tela = new JFrame("Teste de Interface");
        tela.setSize(1000,700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um campo de texto para o viado do usuario
         JTextField textonepae = new JTextField();
         textonepae.setBounds(50,30,200,30);
         tela.add(textonepae);

         //cria um butao kkkkkkkkkkk
         JButton butao = new JButton("O LOBATO É GAY");
         butao.setBounds(90,80,120,30);
         tela.add(butao);

         butao.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                String textoagoraofc = textonepae.getText();
                JOptionPane.showMessageDialog(tela, "Voce digitou: "+textoagoraofc);
             }
         });

        tela.setVisible(true);
    }
}
