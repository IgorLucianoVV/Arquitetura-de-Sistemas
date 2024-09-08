public class Pessoa {

    private Long altura;
    private Long peso;
    private String nome;


    public void setAltura(Long altura) {
        this.altura = altura;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public Pessoa clonar() {
        Pessoa pClone = new Pessoa();
        pClone.setAltura(this.altura);
        pClone.setPeso(this.peso);
        pClone.setNome(this.nome);
        return pClone;
    }
}