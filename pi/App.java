public class App{

    public static void main(String[] args) {
    
        //Criação do objeto / Instância de um Objeto
        imoveisAlugar casa1 = new imoveisAlugar("Casa", "Rua Sao Paulo, 23, Centro", "https://www.istockphoto.com/br/foto/casa-japonesa-com-um-grande-jardim-gm1421545971-467136876", 2300);
        imoveisVenda apto1 = new imoveisVenda("Apartamento", "Rua Jasmin, 234, Centro", "https://www.istockphoto.com/br/foto/casa-japonesa-com-um-grande-jardim-gm1421545971-467136876", 350000);
        cadastroClientes cliente1 = new cadastroClientes("Bruno da Silva", "332.196.920-36" , "11 9 9999-0000 ", "10/02/1995", "Rua das flores, 200."); 
       
        casa1.exibirDetalhes();
        casa1.imprimirLinha();
        apto1.exibirDetalhes();
        apto1.imprimirLinha();
        cliente1.exibirCadastro();
        
    }
} 
