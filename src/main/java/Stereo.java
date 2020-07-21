public class Stereo implements IConnect{
    private String name;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;
    Radio radio;
    int volume;

    public Stereo(String name, CDPlayer cdPlayer, RecordDeck recordDeck, Radio radio, int volume){
        this.name = name;
        this.volume = volume;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
    }

    public String getName() {
        return name;
    }

    public RecordDeck getRecordDeck() {
        return recordDeck;
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public Radio getRadio() {
        return radio;
    }

    public int getVolume() {
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void raiseVolume(int level){
        this.volume += level;
    }
    public void lowerVolume(int level){
        this.volume -= level;
    }
    public String radioPlay(){
        return radio.play();
    }
    public String cdPlay(){
        return cdPlayer.play();
    }

    public String radioTune() {
        return radio.tune();
    }

    public String connect(Stereo stereo) {
        return "Connected to " + this.getName();
    }
}
