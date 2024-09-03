public class Main{
    public static void main(String[] args){
        USBMaca usbMaca = new USBMaca();
        USBAdapter adapter = new USBAdapter(usbMaca);
        Computador computador = new Computador();

        computador.connectUSB(adapter);
    }
}