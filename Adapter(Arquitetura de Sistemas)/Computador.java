public class Computador {
    
    void connectUSB(IUSB usbDevice){
        System.out.println("Conectando dispositivo USB");
        usbDevice.plugin();
        usbDevice.transferData();
    }
}
