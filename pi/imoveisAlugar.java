public class imoveisAlugar {
    
    String tipo;
    String endereco;
    String fotos;
    //Encapsulamento
    private double preco;

    //Métodos / Comportamentos 
    void exibirDetalhes() {
        System.out.println("Tipo do Imóvel: " + tipo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor: " + preco);
        System.out.println("Fotos: " + fotos);
    }

    void imprimirLinha(){
        System.out.println("---------------------------");
    }

    //Método Construtor
    public imoveisAlugar(String tipo, String endereco, String fotos, double preco) {
        this.tipo = tipo;
        this.endereco = endereco;
        this.fotos = fotos;
        this.preco = preco;
    }
}
