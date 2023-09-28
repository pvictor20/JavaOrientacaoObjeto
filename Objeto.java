//Objetos

/*
  Objetos são produtos/instâncias da classe;
 */
public class Objeto {
    public static void main(String[] args) {
        //Declaração de um objeto;
        Produto p0;

        //Declaração e instaciação/iniciação do objeto;
        //p1 -> instância do objeto / objeto;
        Produto p1 = new Produto(); //Construtor
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("======= Produto ========");
        System.out.println(p1.nome);
        System.out.println("R$ " + p1.preco);
        System.out.println(p1.desconto + "%" + " de desconto");

        p0 = new Produto();
        p0.nome = "Caneta Bic"; //Construtor
        p0.preco = 2.45f;
        p0.desconto = 5;
        System.out.println("");

        System.out.println(p0.nome);
        System.out.println("R$ " + p0.preco);
        System.out.println(p0.desconto + "%" + " de desconto");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Paulo Victor";
        pessoa1.ano_nascimento = 2002;
        pessoa1.sexo = "Masculino";

        System.out.println("");

        System.out.println("====== Pessoas ======"); //Construtor
        System.out.println("Nome:" + pessoa1.nome);
        System.out.println("Ano de nascimento: " + pessoa1.ano_nascimento);
        System.out.println("Sexo: " + pessoa1.sexo);

    }
}
