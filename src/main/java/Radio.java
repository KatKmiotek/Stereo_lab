public class Radio extends Component implements IPlay{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(){
        return "Radio 1";
    }

    @Override
    public String play() {
        return "Radio is playing";
    }
}
