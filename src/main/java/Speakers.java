public class Speakers implements IConnect {
    @Override
    public String connect(Stereo stereo) {
        return "Speakers connected to " + stereo.getName();
    }
}
