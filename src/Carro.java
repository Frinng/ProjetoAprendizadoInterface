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
    public static Carro fromString(String linha){
        String[] partes = linha.split(";");
        if(partes.length == 4){
            return new Carro(partes[0], partes[1], partes[2], partes[3]);
        }
        return null;
    }
}