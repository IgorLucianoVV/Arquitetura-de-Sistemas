package Criacional.src;

public abstract class Estudante {
    public String nome;
    public String curso;
    public int id;
}

class Computacao extends Estudante{
    public Computacao(String nome,String curso, int id){
        this.nome = nome;
        this.id = id;
        System.out.println("O estudante " + this.nome + " que faz o curso de Computação tem problemas mentais sérios e possui o id: " + this.id);
    }
}
class Moda extends Estudante{
    public Moda(String nome, String curso, int id){
        this.nome = nome;
        this.id = id;
        System.out.println("O estudante " + this.nome + "que faz o curso de Moda tem que ter dinheiro pra comprar material e possui o id: "+ this.id);
    }
}
