public class Database_Connection {

    private static Database_Connection _connection;

    public static Database_Connection get_connecction(){
        if(_connection == null){
            _connection = new Database_Connection();
        System.out.println("Nova coneção criada");        
    
    }else{
        System.out.println("Já existe uma conexão");
    }
    return _connection;
    
    }
}
