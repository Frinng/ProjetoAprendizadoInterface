import javax.swing.*; //esta biblioteca serve para criar interface grafica //Criar os elementos da interface gráfica
import java.awt.event.ActionEvent; //esta biblioteca serve para responder o usuario //	Representa o evento (clique, etc.)
import java.awt.event.ActionListener;//esta biblioteca serve para receber os dados do usuario//Permite programar a reação ao evento
import java.awt.*;// Biblioteca de layout e manipulação de gráficos


public class principal {
    public static void main(String[] args) {
        //Cria a janela(frame/tela)
        JFrame tela = new JFrame("POWER UP AUTOPEÇAS");
        tela.setSize(1000,700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);

        ImageIcon fundodetelapng = new ImageIcon("Fundodetela.png");
        Image imagem = fundodetelapng.getImage();
        Image imagemcerta = imagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng = new ImageIcon(imagemcerta);


        JLabel fundodetela = new JLabel(fundodetelapng);

        fundodetela.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela.setVerticalAlignment(SwingConstants.CENTER);

        fundodetela.setBounds(0,0,1000,700);
        fundodetela.setLayout(null);



        //BUtao kkkkkkk,butao de cadastrar um novo veiculo
        JButton cadastro_de_veiculos = new JButton("1-Cadastrar um novo Veiculo");//botao para  cadastrar veiculos
        cadastro_de_veiculos.setBounds(400, 200, 200, 40);
        fundodetela.add(cadastro_de_veiculos);

         //Butao para contratar servicos
        JButton contratar_servicos = new JButton("2-Nossos Servicos");//botao apra contratar os servicos da autopecas
        contratar_servicos.setBounds(400,260,200,40);
        fundodetela.add(contratar_servicos);

        //butao para sair
        JButton sair = new JButton("3-Sair");//bem autoexplicativo ne
        sair.setBounds(400,320,200,40);
        fundodetela.add(sair);

        sair.addActionListener(e -> System.exit(0));

        tela.setContentPane(fundodetela);//imagem de fundo
        fundodetela.setLayout(null);

        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}