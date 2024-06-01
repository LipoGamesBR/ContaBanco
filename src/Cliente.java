public class Cliente {

    protected String Nome;
    protected String CPF;
    protected String Endereco;

    public Cliente(String nome, String CPF, String endereco) {
        this.Nome = nome;
        this.CPF = CPF;
        this.Endereco = endereco;
    }

    public String getName(){
        return Nome;
    }

    public String getCPF(){
        return CPF;
    }

    public String getEndereco(){
        return Endereco;
    }
}
