public class EscolhaSoma implements IEscolha {

    @Override
    public void minhaEscolha(String string1, String string2) {
        System.out.println("Voce escolheu somar");
        int valor1, valor2, soma;
        valor1 = Integer.parseInt(string1);
        valor2 = Integer.parseInt(string2);
        soma = valor1+valor2;

        System.out.println("O resultado da soma foi: "+soma);
        System.out.println("***FIM DO PADRÃO***");
        
    }
    
}
