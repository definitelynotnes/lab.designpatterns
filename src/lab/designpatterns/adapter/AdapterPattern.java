package lab.designpatterns.adapter;

public class AdapterPattern {
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    public void connect(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }
    
    public void playMp4() {
        this.advancedMediaPlayer.playMp4();
    }
    
    public void playVLC() {
        this.advancedMediaPlayer.playVLC();
    }
}
