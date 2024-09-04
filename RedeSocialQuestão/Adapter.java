class MP4Adapter implements IMP4Device {
    private MP4 oldDevice;

    public MP4Adapter(MP4 oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void plugIn() {
        oldDevice.connect();
    }

    @Override
    public void transferData() {
        oldDevice.sendData();
    }
}