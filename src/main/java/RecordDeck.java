public class RecordDeck extends Component implements IPlay{
    private int playSeeds;
    public RecordDeck(int playSeeds, String make, String model){
        super(make, model);
        this.playSeeds = playSeeds;
    }

    public int getPlaySeeds() {
        return playSeeds;
    }

    @Override
    public String play() {
        return "Record deck is playing";
    }
}
