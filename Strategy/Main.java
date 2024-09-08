import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    System.out.println("***STRATEGY***");
    Scanner in = new Scanner(System.in);
    IEscolha escolha=  null;
    Contexto contexto = new Contexto();
    String entrada1, entrada2,operacao;

    System.out.println("Entrada com um valor");
    entrada1 = in.nextLine();
    System.out.println("Entre com um outro valor");
    entrada2 = in.nextLine();
    System.out.println("Digite escolha: 1-Concatenar e 2-Somar");
    operacao = in.nextLine();

    if(operacao.equals(operacao)){
        escolha = new EscolhaConcact();
    }else{
        escolha = new EscolhaSoma();
    }


    contexto.setEscolha(escolha);
    contexto.mostarEscolha(entrada1, entrada2);
}

}