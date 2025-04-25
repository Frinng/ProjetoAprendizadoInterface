import javax.swing.*; //esta biblioteca serve para criar interface grafica //Criar os elementos da interface gráfica
import java.awt.event.ActionEvent; //esta biblioteca serve para responder o usuario //	Representa o evento (clique, etc.)
import java.awt.event.ActionListener;//esta biblioteca serve para receber os dados do usuario//Permite programar a reação ao evento

public class principal {
    public static void main(String[] args) {
        //Cria a janela(frame/tela)
        JFrame tela = new JFrame("POWER UP AUTOPEÇAS");
        tela.setSize(1000,700);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);

        //BUtao kkkkkkk,butao de cadastrar um novo veiculo
        JButton cadastro_de_veiculos = new JButton("1-Cadastrar um novo Veiculo");//botao para  cadastrar veiculos
        cadastro_de_veiculos.setBounds(400, 200, 200, 40);
        tela.add(cadastro_de_veiculos);

         //Butao para contratar servicos
        JButton contratar_servicos = new JButton("2-Contratar Nosssos Servicos");//botao apra contratar os servicos da autopecas
        contratar_servicos.setBounds(400,260,200,40);
        tela.add(contratar_servicos);

        //butao para sair
        JButton sair = new JButton("3-Sair");//bem autoexplicativo ne
        sair.setBounds(400,320,200,40);
        tela.add(sair);

        tela.setVisible(true);
    }
}