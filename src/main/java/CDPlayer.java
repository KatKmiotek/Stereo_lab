public class CDPlayer extends Component implements IPlay {
    private int numberOfCD;

    public CDPlayer(int numberOfCD, String make, String model){
        super(make, model);
        this.numberOfCD = numberOfCD;
    }

    public int getNumberOfCD() {
        return numberOfCD;
    }

    @Override
    public String play() {
        return "Cd player is playing";
    }
}
