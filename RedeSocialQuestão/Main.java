public class Main {

  
    public static void main(String[] args) {
        //Fachada Test
        Fachada rede = new Fachada();
        rede.RedeON();

        //Adapter Test
        MP4 oldDevice = new MP4();
        MP4Adapter adapter = new MP4Adapter(oldDevice);
        Computer computer = new Computer();

        computer.transferMP4(adapter);

        //Proxy Test
         //Criando um proxy para a imagem
         Image image = new ProxyImage("imagem.jpg");

         // A imagem real só é carregada quando necessário
         image.display();
 
         // A segunda vez que exibimos a imagem, ela é carregada diretamente do cache (sem carregar novamente)
         image.display();

        
    }
}