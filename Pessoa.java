//Classes

//Atributos

//Métodos

//Construtores

/*
  - Sempre um construtor vazio tem a seguinte forma:

  public NomeDaClasse(){

  }
 */
public class Pessoa {
    String nome;
    String sexo;
    int ano_nascimento;

    //Construtor vazio
    public Pessoa() {

    }

    //Construtor com parâmetros
    public Pessoa(String nome, int ano_nascimento, String sexo){
        this.nome = nome; //Neste objeto, no atributo nome, coloque o valor de nome como parâmetro
        this.ano_nascimento = ano_nascimento;
        this.sexo = sexo;
    }

    void imprime_informacoes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Ano de nascimento: " + this.ano_nascimento);
        System.out.println("Sexo: " + this.sexo);
    }

}
