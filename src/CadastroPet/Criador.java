package CadastroPet;

public class Criador {
   //Privata bloqueia, nao deixa mudar o cod por outra class
    private   String nome;
    private   String sobrenome;
    private   String  cep;
    private   String numeroResidencial;
    private   int idade;
    private   String email;
    private   String telefone;

    public Criador(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }
    public void retornaDados(){

        //modo de puxar dados escolhidos
        if (nome == "Patrick") {
            System.out.println("Esse cara ta com sono");

            System.out.println("Nome:  " + nome + "\n" + "email: " + email);
        }
    }
    public String retornarTodosDados() {
        return "Criador{" +
                "nome='" + nome + '\n' +
                " sobrenome='" + sobrenome + '\n' +
                " cep='" + cep + '\n' +
                " numeroResidencial='" + numeroResidencial + '\n' +
                " idade=" + idade + '\n' +
                " email='" + email + '\n' +
                " telefone='" + telefone + '\n' +
                '}';
    } //'\n' pula linhas

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencial() {
        return numeroResidencial;
    }

    public void setNumeroResidencial(String numeroResidencial) {
        this.numeroResidencial = numeroResidencial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}



