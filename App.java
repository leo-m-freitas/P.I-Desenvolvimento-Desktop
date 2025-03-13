public class App{

    public static void main(String[] args) {
    
        imoveisAlugar casa1 = new imoveisAlugar();
        casa1.tipo = "Casa";
        casa1.endereco = "Rua Sao Paulo, 23, Centro";
        casa1.preco = 2300;

        imoveisVenda apto1 = new imoveisVenda();
        apto1.tipo = "Apartamento";
        apto1.endereco = "Rua Jasmin, 234, Centro";
        apto1.preco = 350000;

        casa1.exibirDetalhes();
        casa1.imprimir();
        apto1.exibirDetalhes();
        apto1.imprimir();
        
    }
}
