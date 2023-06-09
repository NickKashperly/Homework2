package lessson2.Homework2;

public class Whiskas extends  Fooood{
    private final int weight;

    public Whiskas(int weight) {
        this.weight = weight;
    }




    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
