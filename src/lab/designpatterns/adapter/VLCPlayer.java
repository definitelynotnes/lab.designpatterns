package lab.designpatterns.adapter;

public class VLCPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("VLC player is playing media");
        
    }

    @Override
    public void playMp4() {
        System.out.println("VLC player is playing media");
        
    }

}
