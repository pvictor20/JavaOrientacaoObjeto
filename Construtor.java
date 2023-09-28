/*Construtor
  - O construtor de uma classe sempre tem o mesmo nome da classe;
  - Por padrão, a JVM - Java Virtual Machine, cria um tempo de execução, um construtor
  padrão - um construtor vazio;
  - Podemos ter mais de um construtor na classe;
 */

 //Tem esses jeitos de mostrar as informações, tanto como inicializando e declarando, declarar direto no parâmetro
 //e também chamando uma função.
public class Construtor {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(); //(Método) Construtor

        pessoa1.nome = "Vito";
        pessoa1.ano_nascimento = 2002;
        pessoa1.sexo = "Masculino";

        System.out.println("Nome:" + pessoa1.nome);
        System.out.println("Ano de nascimento: " + pessoa1.ano_nascimento);
        System.out.println("Sexo: " + pessoa1.sexo);

        System.out.println("");

        Pessoa pessoa2 = new Pessoa("Paulo", 2002, "Masculino");
        pessoa2.imprime_informacoes();
    }
}
