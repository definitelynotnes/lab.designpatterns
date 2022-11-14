package lab.designpatterns.adapter;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play() {
        System.out.println("Audio player is playing media");
        
    }

}
