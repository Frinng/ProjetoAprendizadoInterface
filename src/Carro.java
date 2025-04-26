public class Carro {
    String nome;
    String  modelo;
    String ano;
    String placa;

    public Carro(String nome,String modelo,String ano,String placa){
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }
    @Override //Permite personalizar comportamento de métodos existentes
    public String toString(){
        return "Proprietário: "+nome+
                " modelo: "+modelo+
                " ano: "+ano+
                "placa: "+placa;
    }
}