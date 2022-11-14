package lab.designpatterns.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AdvancedMediaPlayer vlcPlayer = new VLCPlayer();
        AdapterPattern adapterPattern = new AdapterPattern();
        adapterPattern.connect(vlcPlayer);
        adapterPattern.playVLC();
        
        AdvancedMediaPlayer mp4Player = new Mp4Player();
        adapterPattern.connect(mp4Player);
        adapterPattern.playMp4();
        
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaAdapter mediaAdapter = new MediaAdapter(audioPlayer);
        adapterPattern.connect(mediaAdapter);
        adapterPattern.playMp4();
        adapterPattern.playVLC();
    }
}
