package CadastroPet;

public class Pet {
 //(privado trava o codigo, nao pode ser modificado)
  private  String nome;
  private  String especie;
  private  String raca;
  private  int idade;
  private  String cor;
  private  Criador dono;
  private  String tipoCuidado;

    public Pet(String nome, String especie, String raca, int idade, String cor, Criador dono, String tipoCuidado) {


        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.dono = dono;
        this.tipoCuidado = tipoCuidado;
    }
  //Set modifica
  // get ler a linha privada
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Criador getDono() {
        return dono;
    }

    public void setDono(Criador dono) {
        this.dono = dono;
    }

    public String getTipoCuidado() {
        return tipoCuidado;
    }

    public void setTipoCuidado(String tipoCuidado) {
        this.tipoCuidado = tipoCuidado;
    }
 //Enum cria variavel  dentro  de um atributo
    public enum tiposCuidado {
        BanhoEtosa, Vacina, Fisioteripia}}
