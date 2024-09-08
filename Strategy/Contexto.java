public class Contexto {
    IEscolha minhEscolha;

    public void setEscolha(IEscolha escolha){
        this.minhEscolha = escolha;
    }

    public void mostarEscolha(String string1, String string2){
        minhEscolha.minhaEscolha(string1, string2);
    }
    
}
