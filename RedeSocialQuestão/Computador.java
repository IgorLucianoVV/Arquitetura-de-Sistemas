class Computer {
    void transferMP4(IMP4Device mp4Device) {
        System.out.println("Upload");
        mp4Device.plugIn();
        mp4Device.transferData();
    }
}