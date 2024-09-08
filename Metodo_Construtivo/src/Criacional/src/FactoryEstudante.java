package Criacional.src;

class FactoryEstudante {
    public Estudante getEstudante(String nome, int id, String curso){
        if(curso.equals("Computação")){
            return new Computacao(nome,curso, id);
        }
        if(curso.equals("Moda")){
            return new Moda(nome,curso,id);
        }
        return null;
    }
}