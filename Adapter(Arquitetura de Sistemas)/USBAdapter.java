public class USBAdapter implements IUSB{

    private USBMaca usbMaca;


    public USBAdapter(USBMaca usbMaca){
        this.usbMaca = usbMaca;
    }
    
    public void plugin(){
        usbMaca.connect();
    }

    public void transferData(){
        usbMaca.sendData();
    }
}