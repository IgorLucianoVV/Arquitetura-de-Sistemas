public class Main {

    public static void main(String[] args) {
       FactoryEstudante factory = new FactoryEstudante();
       String nome = "Kadu";
       String curso = "Computação";

       Estudante estudante = factory.getEstudante(nome, curso);
    }
}
