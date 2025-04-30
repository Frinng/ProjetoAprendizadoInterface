import javax.swing.*;
import java.awt.*;

public class Principal {
    static JFrame tela; //tela fixa
    static java.util.List<Carro> listacarros = new java.util.ArrayList<>();

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
        telainicio.add(cadastro_de_veiculos);

        //Butao para contratar servicos
        JButton contratar_servicos = new JButton("2-Nossos Serviços");//botao apra contratar os servicos da autopecas
        contratar_servicos.setBounds(400,260,200,40);
        contratar_servicos.setForeground(Color.WHITE);
        contratar_servicos.setBackground(Color.BLACK);
        contratar_servicos.setHorizontalTextPosition(SwingConstants.CENTER);
        contratar_servicos.setVerticalTextPosition(SwingConstants.BOTTOM);
        contratar_servicos.setFocusPainted(false);// Remove o foco (contorno quando clicado)
        contratar_servicos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telainicio.add(contratar_servicos);

        JButton contatos = new JButton("3-Nossos Contatos");
        contatos.setBounds(400,320,200,40);
        contatos.setForeground(Color.WHITE);
        contatos.setBackground(Color.BLACK);
        contatos.setHorizontalTextPosition(SwingConstants.CENTER);
        contatos.setVerticalTextPosition(SwingConstants.BOTTOM);
        contatos.setFocusPainted(false);
        contatos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telainicio.add(contatos);

        //butao para sair
        JButton sair = new JButton("4-Sair");//bem autoexplicativo ne
        sair.setBounds(400,380,200,40);
        sair.setForeground(Color.WHITE);
        sair.setBackground(Color.BLACK);
        sair.setHorizontalTextPosition(SwingConstants.CENTER);
        sair.setVerticalTextPosition(SwingConstants.BOTTOM);
        sair.setFocusPainted(false);// Remove o foco (contorno quando clicado)
        sair.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telainicio.add(sair);

        cadastro_de_veiculos.addActionListener(e -> Cadastrodeveiculos());
        contratar_servicos.addActionListener(e -> Nossosservicos());
        contatos.addActionListener(e -> contatos());
        sair.addActionListener(e -> System.exit(0));

        telainicio.add(fundodetela);
        tela.setContentPane(telainicio);
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
        campomodelo.setBounds(325,258,300,20);
        telacadastro.add(campomodelo);

        JLabel anocarro = new JLabel("Digite o ano do carro: ");
        anocarro.setBounds(150,240,300,200);
        anocarro.setForeground(Color.WHITE);
        telacadastro.add(anocarro);
        JTextField campoano = new JTextField(50);
        campoano.setBounds(325,330,300,20);
        telacadastro.add(campoano);

        JLabel placacarro = new JLabel("Digite a placa do carro: ");
        placacarro.setBounds(150,310,300,200);
        placacarro.setForeground(Color.WHITE);
        telacadastro.add(placacarro);
        JTextField campocplaca = new JTextField(50);
        campocplaca.setBounds(325,399,300,20);
        telacadastro.add(campocplaca);

        JButton botaoconfimar = new JButton("Confirmar");
        botaoconfimar.setBounds(400,470,200,40);
        botaoconfimar.setHorizontalTextPosition(SwingConstants.CENTER);
        botaoconfimar.setVerticalTextPosition(SwingConstants.BOTTOM);
        botaoconfimar.setForeground(Color.WHITE);
        botaoconfimar.setFocusPainted(false);
        botaoconfimar.setBackground(Color.BLACK);
        botaoconfimar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telacadastro.add(botaoconfimar);
        botaoconfimar.addActionListener(e -> {
            String nome = camponome.getText();
            String modelo = campomodelo.getText();
            String ano = campoano.getText();
            String placa = campocplaca.getText();
            Carro novocarro = new Carro(nome,modelo,ano,placa);
            listacarros.add(novocarro);
            JOptionPane.showMessageDialog(null,"Veiculo Cadastrado com Sucesso.");
        });

        JButton botaovoltar = new JButton("Voltar ao inicio");
        botaovoltar.setBounds(400,520,200,40);
        botaovoltar.setHorizontalTextPosition(SwingConstants.CENTER);
        botaovoltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        botaovoltar.setForeground(Color.WHITE);
        botaovoltar.setFocusPainted(false);
        botaovoltar.setBackground(Color.BLACK);
        botaovoltar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telacadastro.add(botaovoltar);
        botaovoltar.addActionListener(e -> telainical());

        telacadastro.add(fundodetela);

        tela.setContentPane(telacadastro);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void Nossosservicos(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telaservicos = new JPanel(null);

        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);


        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);


        JButton butaotrocadeole = new JButton("1-Troca de oléo");
        butaotrocadeole.setBounds(300,200,200,40);
        butaotrocadeole.setHorizontalTextPosition(SwingConstants.CENTER);
        butaotrocadeole.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaotrocadeole.setForeground(Color.WHITE);
        butaotrocadeole.setFocusPainted(false);
        butaotrocadeole.setBackground(Color.BLACK);
        butaotrocadeole.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaotrocadeole);


        JButton butaoalinhamento = new JButton("2-Alinhamento e balanceamento");
        butaoalinhamento.setBounds(520,200,200,40);
        butaoalinhamento.setHorizontalTextPosition(SwingConstants.CENTER);
        butaoalinhamento.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaoalinhamento.setForeground(Color.WHITE);
        butaoalinhamento.setFocusPainted(false);
        butaoalinhamento.setBackground(Color.BLACK);
        butaoalinhamento.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaoalinhamento);


        JButton butaorevisao = new JButton("3-Revisão de freios");
        butaorevisao.setBounds(300,260,200,40);
        butaorevisao.setHorizontalTextPosition(SwingConstants.CENTER);
        butaorevisao.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaorevisao.setForeground(Color.WHITE);
        butaorevisao.setFocusPainted(false);
        butaorevisao.setBackground(Color.BLACK);
        butaorevisao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaorevisao);


        JButton butaosuspensao = new JButton("4-Suspensão e direção");
        butaosuspensao.setBounds(520,260,200,40);
        butaosuspensao.setHorizontalTextPosition(SwingConstants.CENTER);
        butaosuspensao.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaosuspensao.setForeground(Color.WHITE);
        butaosuspensao.setFocusPainted(false);
        butaosuspensao.setBackground(Color.BLACK);
        butaosuspensao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaosuspensao);


        JButton butaomotor = new JButton("5-Reparos no motor");
        butaomotor.setBounds(300,320,200,40);
        butaomotor.setHorizontalTextPosition(SwingConstants.CENTER);
        butaomotor.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaomotor.setForeground(Color.WHITE);
        butaomotor.setFocusPainted(false);
        butaomotor.setBackground(Color.BLACK);
        butaomotor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaomotor);


        JButton butaotransmissao = new JButton("6-Transmissao e sistema eletrico.");
        butaotransmissao.setBounds(520,320,200,40);
        butaotransmissao.setHorizontalTextPosition(SwingConstants.CENTER);
        butaotransmissao.setVerticalTextPosition(SwingConstants.BOTTOM);
        butaotransmissao.setForeground(Color.WHITE);
        butaotransmissao.setFocusPainted(false);
        butaotransmissao.setBackground(Color.BLACK);
        butaotransmissao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(butaotransmissao);


        JButton voltar = new JButton("7-Voltar");
        voltar.setBounds(410,380,200,40);
        voltar.setHorizontalTextPosition(SwingConstants.CENTER);
        voltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        voltar.setForeground(Color.WHITE);
        voltar.setFocusPainted(false);
        voltar.setBackground(Color.BLACK);
        voltar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaservicos.add(voltar);

        butaotrocadeole.addActionListener(e -> trocadeoleo());
        butaoalinhamento.addActionListener(e -> alinhamento());
        butaorevisao.addActionListener(e -> revisaofreios());
        butaosuspensao.addActionListener(e -> suspensao());
        butaomotor.addActionListener(e -> reparosmotor());
        butaotransmissao.addActionListener(e -> transmissao());

        voltar.addActionListener(e -> telainical());

        telaservicos.add(fundodetela2);


        tela.setContentPane(telaservicos);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void trocadeoleo(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telatrocadeoleo = new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 30 minutos");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telatrocadeoleo.add(tempo);

        JLabel valor = new JLabel("Valor : R$10.0000");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telatrocadeoleo.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telatrocadeoleo.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telatrocadeoleo.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telatrocadeoleo.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telatrocadeoleo.add(fundodetela2);

        tela.setContentPane(telatrocadeoleo);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void alinhamento(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telaalinhamento = new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 1 hora");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telaalinhamento.add(tempo);

        JLabel valor = new JLabel("Valor : R$2.500");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telaalinhamento.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telaalinhamento.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaalinhamento.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telaalinhamento.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telaalinhamento.add(fundodetela2);

        tela.setContentPane(telaalinhamento);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void revisaofreios(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telarevisao = new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 01:30min");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telarevisao.add(tempo);

        JLabel valor = new JLabel("Valor : R$5.500");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telarevisao.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telarevisao.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telarevisao.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telarevisao.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telarevisao.add(fundodetela2);

        tela.setContentPane(telarevisao);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void suspensao(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telasuspensao = new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 02:00Horas");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telasuspensao.add(tempo);

        JLabel valor = new JLabel("Valor : R$500");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telasuspensao.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telasuspensao.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telasuspensao.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telasuspensao.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telasuspensao.add(fundodetela2);

        tela.setContentPane(telasuspensao);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void reparosmotor(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telareparosmotor= new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 03:30 Horas");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telareparosmotor.add(tempo);

        JLabel valor = new JLabel("Valor : R$1.500");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telareparosmotor.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telareparosmotor.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telareparosmotor.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telareparosmotor.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telareparosmotor.add(fundodetela2);

        tela.setContentPane(telareparosmotor);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void transmissao(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telatransmissaor= new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel tempo = new JLabel("Tempo Estimado: 02:00 Horas");
        tempo.setBounds(150,100,300,200);
        tempo.setForeground(Color.WHITE);
        telatransmissaor.add(tempo);

        JLabel valor = new JLabel("Valor : R$900");
        valor.setBounds(150,150,300,200);
        valor.setForeground(Color.WHITE);
        telatransmissaor.add(valor);

        JLabel confirmacao = new JLabel("Deseja Agendar o serviço?");
        confirmacao.setBounds(410,200,300,300);
        confirmacao.setForeground(Color.WHITE);
        telatransmissaor.add(confirmacao);

        JButton sim = new JButton("SIM");
        sim.setBounds(250,380,200,40);
        sim.setHorizontalTextPosition(SwingConstants.CENTER);
        sim.setVerticalTextPosition(SwingConstants.BOTTOM);
        sim.setForeground(Color.WHITE);
        sim.setFocusPainted(false);
        sim.setBackground(Color.BLACK);
        sim.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telatransmissaor.add(sim);

        JButton nao = new JButton("NÃO");
        nao.setBounds(540,380,200,40);
        nao.setHorizontalTextPosition(SwingConstants.CENTER);
        nao.setVerticalTextPosition(SwingConstants.BOTTOM);
        nao.setForeground(Color.WHITE);
        nao.setBackground(Color.BLACK);
        nao.setFocusPainted(false);
        nao.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telatransmissaor.add(nao);

        sim.addActionListener(e -> listahorarios());
        nao.addActionListener(e -> Nossosservicos());


        telatransmissaor.add(fundodetela2);

        tela.setContentPane(telatransmissaor);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void contatos(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel telacontatos= new JPanel(null);
        ImageIcon fundodetelapng2 = new ImageIcon("Fundodetela.png");
        Image ibagem = fundodetelapng2.getImage();
        Image ibagemcerta = ibagem.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundodetelapng2 =new ImageIcon(ibagemcerta);

        JLabel fundodetela2 = new JLabel(fundodetelapng2);
        fundodetela2.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela2.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela2.setBounds(0,0,1000,700);
        fundodetela2.setLayout(null);

        JLabel zap = new JLabel("Nosso WhatsApp: (31)96969-6969");
        zap.setBounds(150,100,300,200);
        zap.setForeground(Color.WHITE);
        telacontatos.add(zap);

        JLabel instagram = new JLabel("Nosso Instagram: @PowerUP_AutoPeças_OFC");
        instagram.setBounds(150,150,300,200);
        instagram.setForeground(Color.WHITE);
        telacontatos.add(instagram);

        JLabel email = new JLabel("Nosso Email: PowerUpAuto@gmail.com");
        email.setBounds(150,200,300,200);
        email.setForeground(Color.WHITE);
        telacontatos.add(email);

        JButton voltar = new JButton("Voltar");
        voltar.setBounds(410,380,200,40);
        voltar.setHorizontalTextPosition(SwingConstants.CENTER);
        voltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        voltar.setForeground(Color.WHITE);
        voltar.setFocusPainted(false);
        voltar.setBackground(Color.BLACK);
        voltar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        telacontatos.add(voltar);

        voltar.addActionListener(e -> telainical());

        telacontatos.add(fundodetela2);

        tela.setContentPane(telacontatos);//imagem de fundo
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void listahorarios(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel listahorarios = new JPanel(null);
        ImageIcon fundotela3png = new ImageIcon("Fundodetela.png");
        Image ibagen = fundotela3png.getImage();
        Image ibagencerta = ibagen.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundotela3png = new ImageIcon(ibagencerta);

        JLabel fundodetela3 = new JLabel(fundotela3png);
        fundodetela3.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela3.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela3.setBounds(0,0,1000,700);
        fundodetela3.setLayout(null);// Desativa o LayoutManager padrão do JLabel, permitindo posicionar manualmente os componentes

        JLabel mensagem = new JLabel("Infelizmente, no momento não há horários disponíveis.");
        mensagem.setBounds(150,100,600,300);
        mensagem.setForeground(Color.WHITE);
        listahorarios.add(mensagem);

        JLabel mensagem1 = new JLabel("Para obter mais informações ou esclarecer dúvidas, solicitamos que entre em contato conosco");
        mensagem1.setBounds(150,120,600,300);
        mensagem1.setForeground(Color.WHITE);
        listahorarios.add(mensagem1);

        JButton contatos = new JButton("Dados para Contato");
        contatos.setBounds(410,320,200,40);
        contatos.setHorizontalTextPosition(SwingConstants.CENTER);
        contatos.setVerticalTextPosition(SwingConstants.BOTTOM);
        contatos.setForeground(Color.WHITE);
        contatos.setBackground(Color.BLACK);
        contatos.setFocusPainted(false);
        contatos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        listahorarios.add(contatos);


        JButton botaovoltar = new JButton("Voltar");
        botaovoltar.setBounds(410,380,200,40);
        botaovoltar.setHorizontalTextPosition(SwingConstants.CENTER);
        botaovoltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        botaovoltar.setForeground(Color.WHITE);
        botaovoltar.setFocusPainted(false);
        botaovoltar.setBackground(Color.BLACK);
        botaovoltar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        listahorarios.add(botaovoltar);

        contatos.addActionListener(e -> contatos());
        botaovoltar.addActionListener(e -> Nossosservicos());

        listahorarios.add(fundodetela3);
        tela.setContentPane(listahorarios);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
    public static void MarcarHorarios(){
        tela.getContentPane().removeAll();
        tela.repaint();

        JPanel listahorarios = new JPanel(null);
        ImageIcon fundotela4png = new ImageIcon("Fundodetela.png");
        Image ibagen = fundotela4png.getImage();
        Image ibagencerta = ibagen.getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        fundotela4png = new ImageIcon(ibagencerta);

        JLabel fundodetela3 = new JLabel(fundotela4png);
        fundodetela3.setHorizontalAlignment(SwingConstants.CENTER);
        fundodetela3.setVerticalAlignment(SwingConstants.CENTER);
        fundodetela3.setBounds(0,0,1000,700);
        fundodetela3.setLayout(null);
    }
}