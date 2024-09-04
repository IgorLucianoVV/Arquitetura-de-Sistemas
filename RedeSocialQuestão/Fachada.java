public class Fachada {
    private RenderImgs renderImgs;
    private PlayVideos playVideos;
    private AudioSystem audioSystem;

    public Fachada() {
        renderImgs = new RenderImgs();
        playVideos = new PlayVideos();  
        audioSystem = new AudioSystem();
    }

    void RedeON() {
        renderImgs.render();
        playVideos.playVideos();
        audioSystem.playAudio();
        System.out.println(" --- RedeON ---");
    }
}