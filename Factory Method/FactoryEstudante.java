class FactoryEstudante{
    public Estudante getEstudante(String nome,String curso){
        if(curso.equals("Computação")){
            return new Computacao(nome,curso);
        }
        if(curso.equals("Moda")){
            return new Moda(nome,curso);
        }
        return null;
    }
}