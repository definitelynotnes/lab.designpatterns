package lab.designpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC() {
        System.out.println("Mp4 player is playing media");
        
    }

    @Override
    public void playMp4() {
        System.out.println("Mp4 player is playing media");
        
    }

}
