public class Main {
    public static void main(String[] args) {

        Pessoa pessoaUm = new Pessoa();

        pessoaUm.setNome("Teste");
        Pessoa pessoaDois = pessoaUm.clonar();

        System.out.println(pessoaDois.getNome());
    }

}