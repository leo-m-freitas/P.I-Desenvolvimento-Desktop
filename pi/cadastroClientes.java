public class cadastroClientes {
    
    //Encapsulamento 
    private String nomeCliente;
    private String CPF;
    private String telefone;
    private String nascimento;
    private String enderecoCliente;
    

    //Métodos / Comportamentos
    void exibirDetalhes() {
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Endereço: " + enderecoCliente);
        System.out.println("CPF: " + CPF);
    }

    void imprimirLinha(){
        System.out.println("---------------------------");
    }

    //Métodos getters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getCpfCliente() {
        return CPF;
    }

    public String getTelefoneCliente() {
        return telefone;
    }

    public String getNascimentoCliente() {
        return nascimento;
    }

    //Métodos Setters
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setEnderecoCliente(String enderecoCliente){
        this.enderecoCliente = enderecoCliente;
    }

    public void setCpfCliente(String CPF){
        this.CPF = CPF;
    }

    public void setTelefoneCliente(String telefone){
        this.telefone = telefone;
    }

    public void setNascimentoCliente(String nascimento){
        this.nascimento = nascimento;
    }

    public void exibirCadastro(){
        System.out.println("Nome Cliente: " + getNomeCliente());
        System.out.println("CPF Cliente: " + getCpfCliente());
        System.out.println("Telefone Cliente: " + getTelefoneCliente());
        System.out.println("Nascimento Cliente: " + getNascimentoCliente());
        System.out.println("Endereço Cliente: "+ getEnderecoCliente());
        
    }

    //Método Construtor 
    public cadastroClientes(String nomeCliente, String CPF, String telefone, String nascimento, String enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.enderecoCliente = enderecoCliente;
    }
}