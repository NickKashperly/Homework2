package lessson2.Homework2;

public class Water extends Fooood{
    private final int volume;


    public Water(int volume) {
        this.volume = volume;
    }
    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public int getWeight() {
        return 0;
    }



}
