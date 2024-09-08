public abstract class Estudante{
    String nome;
    String curso;

}
    class Computacao extends Estudante{
        public Computacao(String nome, String curso){
            this.nome = nome;
            this.curso = curso;
            System.out.println("I am the Batman");
        }
    }
    class Moda extends Estudante{
        public Moda(String nome, String curo){
            this.nome = nome;
            this.curso = curso;
            System.out.println("I still the Batman");
        }
    }
