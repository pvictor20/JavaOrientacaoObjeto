//Classes
/*
 * - O nome das classes iniciam-se com letra maiúsculo;
 * - O nome não deve conter acentuação, caracteres especiais e espaços;
 * - Nas classes Java não existe implementação da função main();
 * - Toda classe Java possui a seguinte forma:
 * - O nome da classe Java DEVE ser o mesmo nome do arquivo Java.
 * - Tudo que estiver dentro das "chaves" {} faz parteda classe.
 
    public class NomeDaClasse{

    }

 */
//Atributos

/*
 * - São características da classe/molde/modelo de dados;
 * - Pode-se entender atributos como variáveis da classe;
 * - Outra forma de nomenclatura para os atributos são estados;
 *  - Atributos são nomeados em letras minúsculas, sem espaço, sem caracteres especials
 * sem acentuação;
 */

 //Métodos
 /*
  * - Pode-se entender métodos como a ação que é realizada por um objeto da classe;
  * - Os métodos são comportamentos dos objetos da classe;
  * - Mesmos requisitos para funções:
    a) Tipo de retorno (Tipo de dado que a função vai retornar);
    b) Nome - Corresponde a ação que a função realiza;
    c) Parâmetros/Argumentos de entrada (Opcional);
    d) Retorno (Opcional - depende do tipo de retorno);
  */
public class Produto {
    String nome;
    float preco;
    float desconto;

    //Método para aumentar o preço do produto em 10
    void aumentar_preco(float valor){
        this.preco = this.preco + valor;
    } 
}
