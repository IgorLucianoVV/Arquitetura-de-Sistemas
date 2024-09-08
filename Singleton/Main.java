public class Main{
public static void main(String[] args) {
    System.out.println("Singletom");

    System.out.println("Tentativa de criação de conexão");
    Database_Connection conexao1 = Database_Connection.get_connecction();


    System.out.println("Tentando criar uma nova conexão");
    Database_Connection conexao2 = Database_Connection.get_connecction();
    
    if(conexao1==conexao2){
        System.out.println("As duas conexões são iguais");
    }
   }
}