package lab.designpatterns.adapter;

public class MediaAdapter implements AdvancedMediaPlayer{
    private MediaPlayer audioPlayer;
    
    public MediaAdapter(MediaPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    
    @Override
    public void playVLC() {
        this.audioPlayer.play();
    }

    @Override
    public void playMp4() {
        this.audioPlayer.play();
    }

}
