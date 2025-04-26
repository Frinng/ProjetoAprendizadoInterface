import javax.swing.*;
import java.awt.*;

public class Teste {
    static JFrame tela; //tela fixa

    public static void main(String[] args) {
        tela = new JFrame("Power Up Autopeças");
        tela.setSize(1000,700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setResizable(false);

        telainical();

        tela.setVisible(true);
    }
    public static void telainical(){
        tela.getContentPane().removeAll();// Remove tudo da tela antes de adicionar o novo painel
        tela.repaint();

        JPanel telainicio = new JPanel(null);

        ImageIcon fundodetelapng = new ImageIcon("Fundodetela.png");
        Image imagem = fundodetelapng.getImage();
        Image imagemcerta = imagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng = new ImageIcon(imagemcerta);

        JLabel fundodetela = new JLabel(fundodetelapng);
        fundodetela.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela.setVerticalAlignment(SwingConstants.CENTER);

        fundodetela.setBounds(0,0,1000,700);
        fundodetela.setLayout(null);

        //botao para cadastrar um novo veiculo
        JButton cadastro_de_veiculos = new JButton("1-Cadastrar um novo Veiculo"); //cria um novo botao para cadastrar um novo veiculo
        cadastro_de_veiculos.setBounds(400,200,200,40);//o tamanho do botao e onde ele se posiciona na tela
        cadastro_de_veiculos.setForeground(Color.WHITE);//deixa os caracteres brancos
        cadastro_de_veiculos.setBackground(Color.BLACK);//deixa o fundo dos botoes como preto
        cadastro_de_veiculos.setHorizontalTextPosition(SwingConstants.CENTER);//centraliza o texto no centro
        cadastro_de_veiculos.setVerticalTextPosition(SwingConstants.BOTTOM);//e deixa o texto dentro do botao
        cadastro_de_veiculos.setFocusPainted(false);//tira o foco do botao quando clicado
        cadastro_de_veiculos.setBorder(BorderFactory.createLineBorder(Color.BLACK));//cria uma borda preta em volta dos botowes
        fundodetela.add(cadastro_de_veiculos);

        //Butao para contratar servicos
        JButton contratar_servicos = new JButton("2-Nossos Servicos");//botao apra contratar os servicos da autopecas
        contratar_servicos.setBounds(400,260,200,40);
        contratar_servicos.setForeground(Color.WHITE);
        contratar_servicos.setBackground(Color.BLACK);
        contratar_servicos.setHorizontalTextPosition(SwingConstants.CENTER);
        contratar_servicos.setVerticalTextPosition(SwingConstants.BOTTOM);
        contratar_servicos.setFocusPainted(false);// Remove o foco (contorno quando clicado)
        contratar_servicos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fundodetela.add(contratar_servicos);

        //butao para sair
        JButton sair = new JButton("3-Sair");//bem autoexplicativo ne
        sair.setBounds(400,320,200,40);
        sair.setForeground(Color.WHITE);
        sair.setBackground(Color.BLACK);
        sair.setHorizontalTextPosition(SwingConstants.CENTER);
        sair.setVerticalTextPosition(SwingConstants.BOTTOM);
        sair.setFocusPainted(false);// Remove o foco (contorno quando clicado)
        sair.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        fundodetela.add(sair);

        cadastro_de_veiculos.addActionListener(e -> Cadastrodeveiculos());
        sair.addActionListener(e -> System.exit(0));

        tela.setContentPane(fundodetela);//imagem de fundo
        fundodetela.setLayout(null);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);


    }
    public  static void Cadastrodeveiculos(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telacadastro = new JPanel(null);

        ImageIcon fundodetelapng = new ImageIcon("Fundodetela.png");
        Image imagem = fundodetelapng.getImage();
        Image imagemcerta = imagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng = new ImageIcon(imagemcerta);

        JLabel fundodetela = new JLabel(fundodetelapng);
        fundodetela.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela.setBounds(0,0,1000,700);
        fundodetela.setLayout(null);


        JLabel nomedodono = new JLabel("Digite o Nome do Proprietário: ");
        nomedodono.setBounds(150, 100, 300, 200);
        nomedodono.setForeground(Color.WHITE);
        telacadastro.add(nomedodono);
        JTextField camponome = new JTextField(50);
        camponome.setBounds(325, 190, 300, 20);
        telacadastro.add(camponome);

        JLabel modelocarro = new JLabel("Digite o modelo do carro: ");
        modelocarro.setBounds(150,170,300,200);
        modelocarro.setForeground(Color.WHITE);
        telacadastro.add(modelocarro);
        JTextField campomodelo = new JTextField(50);
        campomodelo.setBounds(300,258,300,20);
        telacadastro.add(campomodelo);

        JLabel anocarro = new JLabel("Digite o ano do carro: ");
        anocarro.setBounds(150,240,300,200);
        anocarro.setForeground(Color.WHITE);
        telacadastro.add(anocarro);
        JTextField campoano = new JTextField(50);
        campoano.setBounds(280,330,300,20);
        telacadastro.add(campoano);

        JLabel placacarro = new JLabel("Digite a placa do carro: ");
        placacarro.setBounds(150,310,300,200);
        placacarro.setForeground(Color.WHITE);
        telacadastro.add(placacarro);
        JTextField campocplaca = new JTextField(50);
        campocplaca.setBounds(290,399,300,20);
        telacadastro.add(campocplaca);

        JButton botaoconfimar = new JButton("Confirmar");
        botaoconfimar.setBounds(400,470,200,40);
        botaoconfimar.setHorizontalTextPosition(SwingConstants.CENTER);
        botaoconfimar.setVerticalTextPosition(SwingConstants.BOTTOM);
        botaoconfimar.setFocusPainted(false);
        botaoconfimar.setBackground(Color.BLACK);
        botaoconfimar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telacadastro.add(botaoconfimar);
        botaoconfimar.addActionListener(e -> JOptionPane.showMessageDialog(null,"Veiculo cadastrado com sucesso"));

        telacadastro.add(fundodetela);

        tela.setContentPane(telacadastro);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
