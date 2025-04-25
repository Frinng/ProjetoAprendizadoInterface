import javax.swing.*;
import java.awt.event.*;

public class Exemplo {
    public static void main(String[] args) {
        // Cria a janela
        JFrame tela = new JFrame("POWER UP AUTOPEÇAS");
        tela.setSize(1000, 700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);

        // Botão 1 - Clientes
        JButton btnClientes = new JButton("Clientes");
        btnClientes.setBounds(400, 200, 200, 40);
        tela.add(btnClientes);

        // Botão 2 - Produtos
        JButton btnProdutos = new JButton("Produtos");
        btnProdutos.setBounds(400, 260, 200, 40);
        tela.add(btnProdutos);

        // Botão 3 - Vendas
        JButton btnVendas = new JButton("Vendas");
        btnVendas.setBounds(400, 320, 200, 40);
        tela.add(btnVendas);

        // Botão 4 - Sair
        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(400, 380, 200, 40);
        tela.add(btnSair);

        // Ações dos botões
        btnClientes.addActionListener(e -> JOptionPane.showMessageDialog(tela, "Menu Clientes selecionado."));
        btnProdutos.addActionListener(e -> JOptionPane.showMessageDialog(tela, "Menu Produtos selecionado."));
        btnVendas.addActionListener(e -> JOptionPane.showMessageDialog(tela, "Menu Vendas selecionado."));
        btnSair.addActionListener(e -> System.exit(0));

        tela.setVisible(true);
    }
}