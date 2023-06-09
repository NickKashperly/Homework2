package lessson2.Homework2;

public class Cat extends Animal implements Eat {
    private String name;
    private int appetite;
    private int drunk;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getDrunk() {return drunk;}

    public Cat(String name, int appetite, int drunk) {
        this.name = name;
        this.appetite = appetite;
        this.drunk = drunk;
    }
//    public void eat() {
//

}


