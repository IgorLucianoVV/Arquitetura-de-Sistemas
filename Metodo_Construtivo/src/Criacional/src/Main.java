package Criacional.src;
public class Main {
    public static void main(String[] args) throws Exception {
        FactoryEstudante factory = new FactoryEstudante();
        String nome = "Kadu";
        String curso = "Computação";
        int id = 9527;

        Estudante estudante = factory.getEstudante(nome, id, curso);

        System.out.println("Estudante: " + estudante.nome);
    }
}
