import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {
        // Criar a janela
        JFrame janela = new JFrame("Minha Primeira Interface");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null); // Layout livre

        // Criar um campo de texto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 30);
        janela.add(campoTexto);

        // Criar um botão
        JButton botao = new JButton("Clique aqui");
        botao.setBounds(90, 80, 120, 30);
        janela.add(botao);

        // Ação do botão
        botao.addActionListener(e -> {
            String texto = campoTexto.getText();
            JOptionPane.showMessageDialog(janela, "Você digitou: " + texto);
        });

        // Tornar a janela visível
        janela.setVisible(true);
    }
}